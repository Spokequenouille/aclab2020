package com.example.aclab2020.informations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.List;
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
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
    public ResponseEntity<Informations> GetThisInfo(@PathVariable long id) {
        Informations i = informationsRepository.getInfoById(id);
        return ResponseEntity.ok().body(i);
    }

    // Je définis sur /informations/{{id}} la suppression d'une information par son id [DEL]
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInfo (@PathVariable long id) {
        Informations i = informationsRepository.getInfoById(id);
        informationsRepository.delete(i);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Je définis sur /informations/{{id}} la modification d'une information par son id [PUT]
    @PutMapping(path="/{id}")
    public ResponseEntity<Informations> updateInfo (@PathVariable long id, @RequestParam(required = false) String libInfo, @RequestParam(required = false) String fichier, @RequestParam(required = false) String commentaire, @RequestParam(required = false) @DateTimeFormat(pattern="dd/MM/yyyy HH:mm:ss") Date dateInfoDeb, @RequestParam(required = false) @DateTimeFormat(pattern="dd/MM/yyyy HH:mm:ss") Date dateInfoFin) {
        Informations i = informationsRepository.getInfoById(id);

        if (libInfo != null) {
            i.setLibInfo(libInfo);
        }
        if (fichier != null) {
            i.setFichier(fichier);
        }
        if (commentaire != null) {
            i.setCommentaire(commentaire);
        }
        if (dateInfoDeb != null) {
            i.setDateInfoDeb(dateInfoDeb);
        }
        if (dateInfoFin != null) {
            i.setDateInfoFin(dateInfoFin);
        }
        informationsRepository.save(i);
        return ResponseEntity.ok().body(i);
    }

    // Je définis sur /informations/add la création d'une information [POST]
    @PostMapping("/")
    public ResponseEntity<Informations> addInfo(@RequestParam String libInfo, @RequestParam String fichier, @RequestParam String commentaire, @RequestParam @DateTimeFormat(pattern="dd/MM/yyyy HH:mm:ss") Date dateInfoDeb, @RequestParam @DateTimeFormat(pattern="dd/MM/yyyy HH:mm:ss") Date dateInfoFin) {
        Informations i = new Informations();

            i.setLibInfo(libInfo);
            i.setFichier(fichier);
            i.setCommentaire(commentaire);
            i.setDateInfoDeb(dateInfoDeb);
            i.setDateInfoFin(dateInfoFin);

        informationsRepository.save(i);
        return ResponseEntity.ok().body(i);
    }
}
