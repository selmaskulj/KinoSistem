
package unze.ptf.kinosistem.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.List;

@Entity


public class karta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private film film;
    private double cijena;
    private int red;
    private int sjediste;

    public karta() {}

    public karta(Long id, film film, double cijena, int red, int sjediste) {
        this.id = id;
        this.film = film;
        this.cijena = cijena;
        this.red = red;
        this.sjediste = sjediste;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public film getFilm() { return film; }
    public void setFilm(film film) { this.film = film; }

    public double getCijena() { return cijena; }
    public void setCijena(double cijena) { this.cijena = cijena; }

    public int getRed() { return red; }
    public void setRed(int red) { this.red = red; }

    public int getSjediste() { return sjediste; }
    public void setSjediste(int sjediste) { this.sjediste = sjediste; }
}
