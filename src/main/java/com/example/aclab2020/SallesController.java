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
@RequestMapping(path = "/salles")
public class SallesController {
    @Autowired
    private SallesRepository sallesRepository;
    @GetMapping
    public List<Salles> getSalles() {
        return sallesRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Salles> GetThisSalle(@PathVariable int id) throws ResourceNotFoundException {
        Salles i = sallesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Salle non trouvée :: " + id));
        return ResponseEntity.ok().body(i);
    }
}
