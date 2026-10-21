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
        // seed tools
        film film1 = savefilm(new film(null, "Titanik", "Romansa", 195,1997));
        film film2 = savefilm(new film(null, "Pirati sa kariba", "Fantazija", 190,1998));
        film film3 = savefilm(new film(null, "Avatar", "Nucna fantastika", 162,2009));
        film film4 = savefilm(new film(null, "Inception", "Triler", 200,1990));
        film film5 = savefilm(new film(null, "Gladijator", "Akcija", 170,1987));

        // seed characters
        savekarta(new karta(null, film1 , 15.00, 1, 3));
        savekarta(new karta(null, film2 , 10.00, 3, 3));
        savekarta(new karta(null, film1 , 5.50, 15, 9));
        savekarta(new karta(null, film5 , 11.90, 3, 2));
        savekarta(new karta(null, film4 , 12.80, 6, 21));
        savekarta(new karta(null, film3 , 10.00, 5, 13));
    }

    // Characters
    public List<film> findAllfilmove() {
        return new ArrayList<>(filmovi.values());
    }

    public film findfilm(Long id) {
        return filmovi.get(id);
    }

    public film savefilm(film f) {
        if (f.getId() == null) f.setId(filmSeq++);
        filmovi.put(f.getId(), f);
        return f;
    }

    // Tools
    public List<karta> findAllkarte() {
        return new ArrayList<>(karte.values());
    }

    public karta findkarte(Long id) {
        return karte.get(id);
    }

    public karta savekarta(karta k) {
        if (k.getId() == null) k.setId(kartaSeq++);
        karte.put(k.getId(), k);
        return k;
    }


}
