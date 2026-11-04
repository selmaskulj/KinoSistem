
package unze.ptf.kinosistem.data;

import org.springframework.stereotype.Component;
import unze.ptf.kinosistem.model.film;
import unze.ptf.kinosistem.model.karta;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class DemoData {

    private final Map<Long, film> filmovi = new LinkedHashMap<>();
    private final Map<Long, karta> karte = new LinkedHashMap<>();

    private long filmSeq = 1;
    private long kartaSeq = 1;

    public DemoData() {

        film f1 = new film(null, "Titanik", "Romansa", 195, 1997);
        f1.setSlika("/images/titanik.png");
        savefilm(f1);

        film f2 = new film(null, "Pirati sa Kariba", "Fantazija", 190, 2003);
        f2.setSlika("/images/pirati.png");
        savefilm(f2);

        film f3 = new film(null, "Avatar", "Naucna fantastika", 162, 2009);
        f3.setSlika("/images/avatar.png");
        savefilm(f3);

        film f4 = new film(null, "Inception", "Triler", 148, 2010);
        f4.setSlika("/images/inception.png");
        savefilm(f4);

        film f5 = new film(null, "Gladijator", "Akcija", 155, 2000);
        f5.setSlika("/images/gladijator.png");
        savefilm(f5);

        savekarta(new karta(null, f1, 15.00, 1, 3));
        savekarta(new karta(null, f2, 10.00, 3, 3));
        savekarta(new karta(null, f1, 5.50, 15, 9));
        savekarta(new karta(null, f5, 11.90, 3, 2));
        savekarta(new karta(null, f4, 12.80, 6, 21));
        savekarta(new karta(null, f3, 10.00, 5, 13));
    }

    public List<film> findAllfilmove() {
        return new ArrayList<>(filmovi.values());
    }

    public film findfilm(Long id) {
        return filmovi.get(id);
    }

    public film savefilm(film f) {
        if (f.getId() == null) {
            f.setId(filmSeq++);
        }

        filmovi.put(f.getId(), f);
        return f;
    }

    public List<karta> findAllkarte() {
        return new ArrayList<>(karte.values());
    }

    public karta findkarte(Long id) {
        return karte.get(id);
    }

    public karta savekarta(karta k) {
        if (k.getId() == null) {
            k.setId(kartaSeq++);
        }

        karte.put(k.getId(), k);
        return k;
    }
}
