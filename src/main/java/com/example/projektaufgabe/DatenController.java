package com.example.projektaufgabe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/daten")
public class DatenController {
    @Autowired
    private DatenRepository datenRepository;

    @GetMapping
    public List<Daten> getAllDaten() {
        return datenRepository.findAll();
    }

    @PostMapping
    public Daten createDaten(@RequestBody Daten daten) {
        return datenRepository.save(daten);
    }
}
