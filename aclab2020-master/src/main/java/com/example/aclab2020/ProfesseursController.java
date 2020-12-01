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
    public ResponseEntity<Professeurs> GetThisProf(@PathVariable int id) throws ResourceNotFoundException {
        Professeurs i = professeursRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Professeur non trouvée :: " + id));
        return ResponseEntity.ok().body(i);
    }
}
