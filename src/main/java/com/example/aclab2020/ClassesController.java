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
@RequestMapping(path = "/classes")
public class ClassesController {
    @Autowired
    private ClassesRepository classesRepository;
    @GetMapping
    public List<Classes> getClasses() {
        return classesRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Classes> GetThisClasse(@PathVariable int id) throws ResourceNotFoundException {
        Classes i = classesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Classe non trouvée :: " + id));
        return ResponseEntity.ok().body(i);
    }
}
