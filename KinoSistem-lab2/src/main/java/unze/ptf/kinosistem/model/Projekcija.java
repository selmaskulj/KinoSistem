package unze.ptf.kinosistem.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.List;

@Entity


public class Projekcija {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String termin;
    private double cijena;

    @ManyToOne
    @JoinColumn(name="film_id")
    private film film;

    public Projekcija() {}

    public Long getId() {
        return id;
    }

    public String getTermin() {
        return termin;
    }

    public double getCijena() {
        return cijena;
    }

    public film getFilm() {
        return film;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTermin(String termin) {
        this.termin = termin;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public void setFilm(film film) {
        this.film = film;
    }

    public Projekcija(Long id, String termin, double cijena, film film) {
        this.id = id;
        this.termin = termin;
        this.cijena = cijena;
        this.film = film;
    }



}
