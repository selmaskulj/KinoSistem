
package unze.ptf.kinosistem.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import unze.ptf.kinosistem.Repository.FilmRepository;
import unze.ptf.kinosistem.Repository.KartaRepository;

import unze.ptf.kinosistem.model.film;
import unze.ptf.kinosistem.model.karta;

@Component
public class DataInitializer implements CommandLineRunner {

    private final FilmRepository filmRepository;
    private final KartaRepository kartaRepository;

    public DataInitializer(
            FilmRepository filmRepository,
            KartaRepository kartaRepository) {

        this.filmRepository = filmRepository;
        this.kartaRepository = kartaRepository;
    }

    @Override
    public void run(String... args) {

        // Dodavanje početnih filmova ako je tabela prazna
        if (filmRepository.count() == 0) {

            film f1 = new film(null, "Titanik", "Romansa", 195, 1997);
            f1.setSlika("/images/titanik.png");
            filmRepository.save(f1);

            film f2 = new film(null, "Pirati sa Kariba", "Fantazija", 190, 2003);
            f2.setSlika("/images/pirati.png");
            filmRepository.save(f2);

            film f3 = new film(null, "Avatar", "Naucna fantastika", 162, 2009);
            f3.setSlika("/images/avatar.png");
            filmRepository.save(f3);

            film f4 = new film(null, "Inception", "Triler", 148, 2010);
            f4.setSlika("/images/inception.png");
            filmRepository.save(f4);

            film f5 = new film(null, "Gladijator", "Akcija", 155, 2000);
            f5.setSlika("/images/gladijator.png");
            filmRepository.save(f5);
        }

        // Dodavanje početnih karata ako je tabela prazna
        if (kartaRepository.count() == 0) {

            film f1 = filmRepository.findAll().stream()
                    .filter(f -> f.getNaziv().equals("Titanik"))
                    .findFirst().orElse(null);

            film f2 = filmRepository.findAll().stream()
                    .filter(f -> f.getNaziv().equals("Pirati sa Kariba"))
                    .findFirst().orElse(null);

            film f3 = filmRepository.findAll().stream()
                    .filter(f -> f.getNaziv().equals("Avatar"))
                    .findFirst().orElse(null);

            film f4 = filmRepository.findAll().stream()
                    .filter(f -> f.getNaziv().equals("Inception"))
                    .findFirst().orElse(null);

            film f5 = filmRepository.findAll().stream()
                    .filter(f -> f.getNaziv().equals("Gladijator"))
                    .findFirst().orElse(null);

            if (f1 != null && f2 != null && f3 != null
                    && f4 != null && f5 != null) {

                kartaRepository.save(new karta(null, f1, 15.00, 1, 3));
                kartaRepository.save(new karta(null, f2, 10.00, 3, 3));
                kartaRepository.save(new karta(null, f1, 5.50, 15, 9));
                kartaRepository.save(new karta(null, f5, 11.90, 3, 2));
                kartaRepository.save(new karta(null, f4, 12.80, 6, 21));
                kartaRepository.save(new karta(null, f3, 10.00, 5, 13));
            }
        }
    }
}

