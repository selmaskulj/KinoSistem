package unze.ptf.kinosistem.model;

import java.util.ArrayList;
import java.util.List;

public class film {


    private Long id;
    private String naziv;
    private String zanr; //trenutna snaga
    private int trajanje;  // 0..5
    private int godina; //sakupljeni bodovi


    public film(){}

    public film(Long id, String naziv, String zanr, int trajanje, int godina) {
        this.id = id;
        this.naziv = naziv;
        this.zanr = zanr;
        this.trajanje = trajanje;
        this.godina = godina;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int points) {
        this.godina = godina;
    }


}
