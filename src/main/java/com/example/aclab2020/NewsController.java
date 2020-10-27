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
@RequestMapping(path = "/news")
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;
    @GetMapping("/")
    public List<News> getNew() {
        return newsRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<News> getNew(@PathVariable int id) throws ResourceNotFoundException {
        News i = newsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("News non trouvée :: " + id));
        return ResponseEntity.ok().body(i);
    }

    @PostMapping(path="/")
    public ResponseEntity<News> addNews (@RequestParam int id, @RequestParam String name) {
        News i = new News();
        i.setId(id);
        i.setName(name);
        newsRepository.save(i);
        return ResponseEntity.ok().body(i);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNews (@PathVariable int id) throws ResourceNotFoundException {
       News i = newsRepository.findById(id)
               .orElseThrow(() -> new ResourceNotFoundException("News non trouvée :: " + id));
        newsRepository.delete(i);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<News> changeNews (@PathVariable int id, @RequestParam String name) throws ResourceNotFoundException {
        News i = newsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("News non trouvée :: " + id));
        i.setName(name);
        newsRepository.save(i);
        return ResponseEntity.ok().body(i);
    }
}