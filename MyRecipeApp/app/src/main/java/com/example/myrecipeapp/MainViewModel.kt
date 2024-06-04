package com.example.myrecipeapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private val _categoryState= mutableStateOf(RecipeState())
    val categoryState:State<RecipeState> = _categoryState

    private fun fetchCategories(){
        viewModelScope.launch {
            try {
                val response = recipeService.getCategories()
                _categoryState.value = _categoryState.value.copy(
                    loading = false,
                    list =response.categories,
                    error = null
                )
            }catch (e:Exception){
                _categoryState.value=_categoryState.value.copy(
                    loading = false,
                    error= "Error fetching Categories ${e.message}"
                )
            }

        }

    }

    data class RecipeState(
        val loading:Boolean = true,
        val list:List<Category> = emptyList(),
        val error: String? = null
    )
}