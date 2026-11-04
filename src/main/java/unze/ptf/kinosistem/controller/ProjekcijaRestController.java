package unze.ptf.kinosistem.controller;

import org.springframework.web.bind.annotation.*;
import unze.ptf.kinosistem.model.Projekcija;
import unze.ptf.kinosistem.Repository.ProjekcijaRepository;
import java.util.List;


@RestController
@RequestMapping("/api/projekcija")
public class ProjekcijaRestController {

    private final ProjekcijaRepository projekcijaRepository;

    public ProjekcijaRestController(ProjekcijaRepository projekcijaRepository ) {
        this.projekcijaRepository = projekcijaRepository;
    }

    @GetMapping
    public List<Projekcija> getAll() {
        return projekcijaRepository.findAll();
    }

    @GetMapping ("/{id}")
    public Projekcija getProjekcijaPoId(@PathVariable Long id) {
        return projekcijaRepository.findById(id).orElse(null);
    }

}
