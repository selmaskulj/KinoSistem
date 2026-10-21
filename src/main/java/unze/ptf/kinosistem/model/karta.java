package unze.ptf.kinosistem.model;

import java.util.ArrayList;
import java.util.List;

public class karta {

    private Long id;
    private double cijena;
    private static film film; //trenutna snaga
    private int red;  // 0..5
    private int sjediste; //sakupljeni bodovi


    public karta(Long id, film film, double cijena, int red, int sjediste) {
        this.id = id;
        this.film = film;
        this.cijena = cijena;
        this.red = red;
        this.sjediste = sjediste;
    }

    public Long getId() {
        return id;
    }

    public int getSjediste() {
        return sjediste;
    }

    public int getRed() {
        return red;
    }

    public static film getFilm() {
        return film;
    }

    public double getCijena() {
        return cijena;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSjediste(int sjediste) {
        this.sjediste = sjediste;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setFilm(film film) {
        this.film = film;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public karta() {

    }

}

