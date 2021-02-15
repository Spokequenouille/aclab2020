package com.example.aclab2020;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/professeurs")
public class ProfesseursController {
    @Autowired
    private ProfesseursRepository professeursRepository;
    @GetMapping
    public List<Professeurs> getProfs() {
        return professeursRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professeurs> GetThisProf(@PathVariable long id) {
        Professeurs i = professeursRepository.getProfByIdProf(id);
        return ResponseEntity.ok().body(i);
    }

    // Je définis sur /professeurs/{{id}} la suppression d'un professeur par son id [DEL]
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfesseur (@PathVariable long id) {
        Professeurs i = professeursRepository.getProfByIdProf(id);
        professeursRepository.delete(i);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Je définis sur /professeurs/{{id}} la modification d'un professeur par son id [PUT]
    @PutMapping(path="/{id}")
    public ResponseEntity<Professeurs> updateProfesseur (@PathVariable long id, @RequestParam(required = false) String nomProf, @RequestParam(required = false) String prenomProf) {
        Professeurs i = professeursRepository.getProfByIdProf(id);
        if (i == null) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        if (nomProf != null) {
            i.setNomProf(nomProf);
        }
        if (prenomProf != null) {
            i.setPrenomProf(prenomProf);
        }

        professeursRepository.save(i);
        return ResponseEntity.ok().body(i);
    }

    // Je définis sur /professeurs/add la création d'un professeur [POST]
    @PostMapping("/add")
    public ResponseEntity<Professeurs> addProfesseur(@RequestParam String nomProf, @RequestParam String prenomProf) {
        Professeurs i = new Professeurs();

        i.setNomProf(nomProf);
        i.setPrenomProf(prenomProf);

        professeursRepository.save(i);
        return ResponseEntity.ok().body(i);
    }
}
