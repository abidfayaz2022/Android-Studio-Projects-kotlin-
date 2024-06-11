package com.example.myrecipeapp

sealed class Screen(val route:String) {
    object RecipeScreen:Screen("recipescreen")
    object RecipeDetailScreen:Screen("recipedetail")
}