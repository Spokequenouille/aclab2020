package com.example.aclab2020.salles;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/salles")
public class SallesController {
    @Autowired
    private SallesRepository sallesRepository;
    @GetMapping
    public List<Salles> getSalles() {
        return sallesRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Salles> GetThisSalle(@PathVariable long id) {
        Salles i = sallesRepository.getSalleByIdSalle(id);
        if (i == null) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return ResponseEntity.ok().body(i);
    }

    // Je définis sur /salles/{{id}} la suppression d'une salle par son id [DEL]
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSalle (@PathVariable long id) {
        Salles i = sallesRepository.getSalleByIdSalle(id);
        sallesRepository.delete(i);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Je définis sur /salles/{{id}} la modification d'une salle par son id [PUT]
    @PutMapping(path="/{id}")
    public ResponseEntity<Salles> updatePromotion (@PathVariable long id, @RequestParam(required = false) String libSalle, @RequestParam(required = false) Integer nbrePlaces, @RequestParam(required = false) String adresse) {
        Salles i = sallesRepository.getSalleByIdSalle(id);
        if (i == null) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        if (libSalle != null) {
            i.setLibSalle(libSalle);
        }
        if (nbrePlaces != null) {
            i.setNbrePlaces(nbrePlaces);
        }
        if (adresse != null) {
            i.setAdresse(adresse);
        }

        sallesRepository.save(i);
        return ResponseEntity.ok().body(i);
    }

    // Je définis sur /salles/add la création d'une salle [POST]
    @PostMapping("/add")
    public ResponseEntity<Salles> addPromotion(@RequestParam String libSalle, @RequestParam int nbrePlaces, @RequestParam String adresse) {
        Salles i = new Salles();

        i.setLibSalle(libSalle);
        i.setNbrePlaces(nbrePlaces);
        i.setAdresse(adresse);

        sallesRepository.save(i);
        return ResponseEntity.ok().body(i);
    }
}
