
package unze.ptf.kinosistem.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name="film")
public class film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String naziv;
    private String zanr;
    private int trajanje;
    private int godina;
    private String slika;

    public film() {}

    public film(Long id, String naziv, String zanr, int trajanje, int godina) {
        this.id = id;
        this.naziv = naziv;
        this.zanr = zanr;
        this.trajanje = trajanje;
        this.godina = godina;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNaziv() { return naziv; }
    public void setNaziv(String naziv) { this.naziv = naziv; }

    public String getZanr() { return zanr; }
    public void setZanr(String zanr) { this.zanr = zanr; }

    public int getTrajanje() { return trajanje; }
    public void setTrajanje(int trajanje) { this.trajanje = trajanje; }

    public int getGodina() { return godina; }
    public void setGodina(int godina) { this.godina = godina; }

    public String getSlika() { return slika; }
    public void setSlika(String slika) { this.slika = slika; }
}
