package com.example.aclab2020.promotions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<Promotions> GetThisPromo(@PathVariable long id) {
        Promotions i = promotionsRepository.getPromoByIdPromo(id);
        return ResponseEntity.ok().body(i);
    }

    // Je définis sur /promotions/{{id}} la suppression d'une promotion par son id [DEL]
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePromotion (@PathVariable long id) {
        Promotions i = promotionsRepository.getPromoByIdPromo(id);
        promotionsRepository.delete(i);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Je définis sur /promotions/{{id}} la modification d'une promotion par son id [PUT]
    @PutMapping(path="/{id}")
    public ResponseEntity<Promotions> updatePromotion (@PathVariable long id, @RequestParam(required = false) String libPromo) {
        Promotions i = promotionsRepository.getPromoByIdPromo(id);
        if (i == null) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        if (libPromo != null) {
            i.setLibPromo(libPromo);
        }

        promotionsRepository.save(i);
        return ResponseEntity.ok().body(i);
    }

    // Je définis sur /promotions/add la création d'une promotion [POST]
    @PostMapping("/add")
    public ResponseEntity<Promotions> addPromotion(@RequestParam String libPromo) {
        Promotions i = new Promotions();

        i.setLibPromo(libPromo);

        promotionsRepository.save(i);
        return ResponseEntity.ok().body(i);
    }
}
