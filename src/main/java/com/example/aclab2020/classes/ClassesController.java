package com.example.aclab2020.classes;

import com.example.aclab2020.matieres.MatieresRepository;
import com.example.aclab2020.professeurs.ProfesseursRepository;
import com.example.aclab2020.promotions.PromotionsRepository;
import com.example.aclab2020.salles.SallesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping(path = "/classes")
public class ClassesController {
    @Autowired
    private ClassesRepository classesRepository;
    private MatieresRepository matieresRepository;
    private ProfesseursRepository professeursRepository;
    private PromotionsRepository promotionsRepository;
    private SallesRepository sallesRepository;
    @GetMapping
    public List<Classes> getClasses() {
        return classesRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Classes> GetThisClasse(@PathVariable long id) {
        Classes i = classesRepository.getClasseByIdClasse(id);
        return ResponseEntity.ok().body(i);
    }

    // Je définis sur /classes/{{id}} la suppression d'une classe par son id [DEL]
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClasse (@PathVariable long id) {
        Classes i = classesRepository.getClasseByIdClasse(id);
        classesRepository.delete(i);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Je définis sur /classes/{{id}} la modification d'une classe par son id [PUT]
    @PutMapping(path="/{id}")
    public ResponseEntity<Classes> updateClasse (@PathVariable long id, @RequestParam(required = false) @DateTimeFormat(pattern="dd/MM/yyyy HH:mm:ss") Date dateClasse, @RequestParam(required = false) Float duree) {
        Classes i = classesRepository.getClasseByIdClasse(id);

        if (dateClasse != null) {
            i.setDateClasse(dateClasse);
        }
        if (duree != null) {
            i.setDuree(duree);
        }
        classesRepository.save(i);
        return ResponseEntity.ok().body(i);
    }

    // Je définis sur /classes/add la création d'une food [POST]
    @PostMapping("/add")
    public ResponseEntity<Classes> addClasse(@RequestParam @DateTimeFormat(pattern="dd/MM/yyyy HH:mm:ss") Date dateClasse, @RequestParam Float duree, @RequestParam long matiere_id, @RequestParam long prof_id, @RequestParam long promo_id, @RequestParam long salle_id) {
        Classes i = new Classes();

        i.setDateClasse(dateClasse);
        i.setDuree(duree);
        i.setMatiere(matieresRepository.getMatiereByIdMatiere(matiere_id));
        i.setPromotion(promotionsRepository.getPromoByIdPromo(promo_id));
        i.setProfesseur(professeursRepository.getProfByIdProf(prof_id));
        i.setSalle(sallesRepository.getSalleByIdSalle(salle_id));
        classesRepository.save(i);
        return ResponseEntity.ok().body(i);
    }


}
