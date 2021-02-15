package com.example.aclab2020.matieres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/matieres")
public class MatieresController {
    @Autowired
    private MatieresRepository matieresRepository;
    @GetMapping
    public List<Matieres> getMatieres() {
        return matieresRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Matieres> GetThisMatiere(@PathVariable long id) {
        Matieres i = matieresRepository.getMatiereByIdMatiere(id);
        return ResponseEntity.ok().body(i);
    }

    // Je définis sur /matieres/{{id}} la suppression d'une matiere par son id [DEL]
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMatiere (@PathVariable long id) {
        Matieres i = matieresRepository.getMatiereByIdMatiere(id);
        matieresRepository.delete(i);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Je définis sur /matieres/{{id}} la modification d'une matiere par son id [PUT]
    @PutMapping(path="/{id}")
    public ResponseEntity<Matieres> updateMatiere (@PathVariable long id, @RequestParam String libMatiere) {
        Matieres i = matieresRepository.getMatiereByIdMatiere(id);

        i.setLibMatiere(libMatiere);

        matieresRepository.save(i);
        return ResponseEntity.ok().body(i);
    }

    // Je définis sur /matiere/add la création d'une matiere [POST]
    @PostMapping("/add")
    public ResponseEntity<Matieres> addMatiere(@RequestParam long idClasse, @RequestParam String libMatiere) {
        Matieres i = new Matieres();

        i.setIdClasse(idClasse);
        i.setLibMatiere(libMatiere);

        matieresRepository.save(i);
        return ResponseEntity.ok().body(i);
    }
}
