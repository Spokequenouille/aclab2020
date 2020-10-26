package com.example.aclab2020;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @GetMapping("/{newId}")
    public Optional<News> getNew(@PathVariable("newId") int newId) {
        return newsRepository.findById(newId);
    }
    @PostMapping(path="/add")
    public Integer addNews (@RequestParam int id_news
            , @RequestParam String name) {
        News news = new News();
        news.setId(id_news);
        news.setName(name);
        newsRepository.save(news);
        return 200;
    }
}