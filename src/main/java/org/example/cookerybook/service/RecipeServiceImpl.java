package org.example.cookerybook.service;

import lombok.RequiredArgsConstructor;
import org.example.cookerybook.model.Ingredient;
import org.example.cookerybook.model.Recipe;
import org.example.cookerybook.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RecipeServiceImpl implements RecipeService {
    @Autowired
    private final RecipeRepository recipeRepository;
    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @Override
    public void save(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    @Override
    public Recipe getRandomRecipe() {
        return recipeRepository.getRandomRecipe();
    }

    @Override
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    @Override
    public List<Recipe> getAllRecipesByIngredients(List<Ingredient> ingredients) {
        return recipeRepository.findAllByRecipeIngredientIn(ingredients);
    }

    @Override
    public List<Recipe> getRecipesByRating(Integer rating) {
        return recipeRepository.findAllByRatingGreaterThan(rating);
    }
}
