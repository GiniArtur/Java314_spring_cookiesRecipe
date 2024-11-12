package org.example.cookerybook.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import org.example.cookerybook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller



public class RecipeController {

    private final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }
}
