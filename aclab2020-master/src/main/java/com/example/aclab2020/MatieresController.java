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
@RequestMapping(path = "/matieres")
public class MatieresController {
    @Autowired
    private MatieresRepository matieresRepository;
    @GetMapping
    public List<Matieres> getMatieres() {
        return matieresRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Matieres> GetThisMatiere(@PathVariable int id) throws ResourceNotFoundException {
        Matieres i = matieresRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Matière non trouvée :: " + id));
        return ResponseEntity.ok().body(i);
    }
}
