package com.kancth03.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/articles")
@Controller
public class ArticleController {

    @GetMapping
    public String articles(Model model) {
        model.addAttribute("articles", 1);
        return "articles/index";
    }

    @GetMapping("/{articleId}")
    public String article(@PathVariable("articleId")Long articleId,
                          Model model) {
        model.addAttribute("article", 1);
        model.addAttribute("articleComments", List.of());

        return "articles/detail";
    }
}
