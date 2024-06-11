package com.example.myrecipeapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun RecipeApp(navController:NavHostController){
    val recipeViewModel:MainViewModel= viewModel()
    val viewState by recipeViewModel.categoryState


    NavHost(navController=navController,startDestination = Screen.RecipeScreen.route ){
        composable(route = Screen.RecipeScreen.route){
            RecipeScreen(viewState=viewState, navigateToDetail = {
                //This part is responsible for passing data from the current screen to the detail screen
                //It utilizes the the savedStateHandle, which is a component of  the compose navigation framework.
                navController.currentBackStackEntry?.savedStateHandle?.set("1",it) //it is saying that at the Key "cat" i am setting the Category sate
                navController.navigate(Screen.RecipeDetailScreen.route)
            })
        }
        composable(route = Screen.RecipeDetailScreen.route){
            val category=navController.previousBackStackEntry?.savedStateHandle?.get<Category>("1") ?: Category("","","","dfbf")
            //here i am retrieving(get) the type is Category at the position so the Key is  "cat"
            CategoryDetailScreen(category = category)



        }

    }


}