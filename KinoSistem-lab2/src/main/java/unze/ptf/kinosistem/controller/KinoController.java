package unze.ptf.kinosistem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import unze.ptf.kinosistem.model.film;
import unze.ptf.kinosistem.model.karta;
import unze.ptf.kinosistem.model.Projekcija;

import unze.ptf.kinosistem.Repository.FilmRepository;
import unze.ptf.kinosistem.Repository.KartaRepository;
import unze.ptf.kinosistem.Repository.ProjekcijaRepository;

import java.util.List;

@Controller
public class KinoController {

    private final FilmRepository filmRepository;
    private final KartaRepository kartaRepository;
    private final ProjekcijaRepository projekcijaRepository;

    public KinoController(
            FilmRepository filmRepository,
            KartaRepository kartaRepository,
            ProjekcijaRepository projekcijaRepository) {

        this.filmRepository = filmRepository;
        this.kartaRepository = kartaRepository;
        this.projekcijaRepository = projekcijaRepository;
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/a";
    }

    // Prikaz filmova
    @GetMapping("/a")
    public String prikaziFilmove(Model model) {
        model.addAttribute("filmovi", filmRepository.findAll());
        return "listA";
    }

    // Prikaz karata
    @GetMapping("/b")
    public String prikaziKarte(Model model) {
        model.addAttribute("karte", kartaRepository.findAll());
        return "listB";
    }

    // Detalji odabranog filma i njegove karte
    @GetMapping("/a/action/{id}")
    public String detaljiFilma(@PathVariable Long id, Model model) {

        film odabraniFilm = filmRepository.findById(id).orElse(null);

        if (odabraniFilm == null) {
            return "redirect:/a";
        }

        List<karta> karteFilma = kartaRepository.findAll()
                .stream()
                .filter(k -> k.getFilm() != null
                        && k.getFilm().getId().equals(id))
                .toList();

        model.addAttribute("film", odabraniFilm);
        model.addAttribute("karte", karteFilma);

        return "action";
    }

    // Prikaz projekcija
    @GetMapping("/projekcije")
    public String prikaziProjekcije(Model model) {

        model.addAttribute("projekcije", projekcijaRepository.findAll());
        model.addAttribute("projekcija", new Projekcija());
        model.addAttribute("filmovi", filmRepository.findAll());

        return "Projekcija";
    }

    // Dodavanje projekcije
    @PostMapping("/projekcije/sacuvaj")
    public String sacuvajProjekciju(
            @RequestParam String termin,
            @RequestParam double cijena,
            @RequestParam Long filmId) {

        Projekcija projekcija = new Projekcija();
        projekcija.setTermin(termin);
        projekcija.setCijena(cijena);

        film odabraniFilm = filmRepository.findById(filmId).orElse(null);

        if (odabraniFilm == null) {
            return "redirect:/projekcije";
        }

        projekcija.setFilm(odabraniFilm);
        projekcijaRepository.save(projekcija);

        return "redirect:/projekcije";
    }

    // Ažuriranje projekcije
    @PostMapping("/projekcije/update/{id}")
    public String azurirajProjekciju(
            @PathVariable Long id,
            @RequestParam String termin,
            @RequestParam double cijena) {

        Projekcija projekcija =
                projekcijaRepository.findById(id).orElse(null);

        if (projekcija == null) {
            return "redirect:/projekcije";
        }

        projekcija.setTermin(termin);
        projekcija.setCijena(cijena);

        projekcijaRepository.save(projekcija);

        return "redirect:/projekcije";
    }
}