package unze.ptf.kinosistem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import unze.ptf.kinosistem.data.DemoData;
import unze.ptf.kinosistem.model.film;
import unze.ptf.kinosistem.model.karta;

import java.util.List;

@Controller
public class KinoController {

    private final DemoData data;

    public KinoController(DemoData data) {
        this.data = data;
    }

    // Mapiranja koja vode do template stranica

    @GetMapping("/")
    public String home() {
        return "redirect:/a";
    }

    @GetMapping("/a")
    public String prikaziFilmove(Model model) {
        model.addAttribute("filmovi", data.findAllfilmove());
        return "listA";
    }

    @GetMapping("/b")
    public String prikaziKarte(Model model) {
        model.addAttribute("karte", data.findAllkarte());
        return "listB";
    }

    @GetMapping("/a/action/{id}")
    public String detaljiFilma(@PathVariable Long id, Model model) {
        film film = data.findfilm(id);

        if (film == null) {
            return "redirect:/a";
        }

        List<karta> karteFilma = data.findAllkarte()
                .stream()
                .filter(k -> k.getFilm() != null
                        && k.getFilm().equals(id))
                .toList();

        model.addAttribute("film", film);
        model.addAttribute("karte", karteFilma);

        return "action";
    }
}