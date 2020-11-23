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
@RequestMapping(path = "/promotions")
public class PromotionsController {
    @Autowired
    private PromotionsRepository promotionsRepository;
    @GetMapping
    public List<Promotions> getPromos() {
        return promotionsRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Promotions> GetThisPromo(@PathVariable int id) throws ResourceNotFoundException {
        Promotions i = promotionsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Promotion non trouvée :: " + id));
        return ResponseEntity.ok().body(i);
    }
}
