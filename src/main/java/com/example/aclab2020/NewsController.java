package com.example.aclab2020;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/news")
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;
    @GetMapping("/all")
    public Iterable<News> getNew() {
        return newsRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<News> getNew(@PathVariable int id) {
        return newsRepository.findById(id);
    }
    @PostMapping(path="/add")
    public Integer addNews (@RequestParam int id, @RequestParam String name) {
        News news = new News();
        news.setId(id);
        news.setName(name);
        newsRepository.save(news);
        return 200;
    }
/*    @DeleteMapping("/delete/{id}")
    public Integer deleteNews (@PathVariable int id) {
        return 200;
    }

    @PatchMapping(path="/change/{id}") ?
    @PutMapping(path="/change/{id}") ?
    public Integer changeNews (@PathVariable int id, @RequestParam String name) {
        return 200;
    }*/
}