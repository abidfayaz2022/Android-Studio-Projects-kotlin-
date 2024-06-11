package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FirstScreen(navigateToSecondScreen:(String)->Unit){
    val name = remember{ mutableStateOf("") }

    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "This is my first Screen")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = name.value,
            onValueChange ={name.value = it} )

        Button(onClick = {
            navigateToSecondScreen(name.value)
        }) {
            Text(text = "Go to the second Screen")

        }

    }
}





@Preview(showBackground = true)
@Composable
fun FirstPreview(){
    FirstScreen({}) //add empty curly brackets here when we pass parameter in composable function
}
