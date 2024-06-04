package com.example.myrecipeapp

import java.lang.invoke.TypeDescriptor

data class Category(val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescriptor: String)


data class CategoryResponse(val categories:List<Category>)
