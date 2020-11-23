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
@RequestMapping(path = "/informations")
public class InformationsController {
    @Autowired
    private InformationsRepository informationsRepository;
    @GetMapping
    public List<Informations> getInfos() {
        return informationsRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Informations> GetThisInfo(@PathVariable int id) throws ResourceNotFoundException {
        Informations i = informationsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Information non trouvée :: " + id));
        return ResponseEntity.ok().body(i);
    }
}
