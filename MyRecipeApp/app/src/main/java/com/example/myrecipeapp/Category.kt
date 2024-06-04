package com.example.myrecipeapp

data class Category(val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescriptor: String)


data class CategoryResponse(val categories:List<Category>)
