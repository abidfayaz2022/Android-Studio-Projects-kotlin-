package com.example.capaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.capaingame.ui.theme.CapainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CapainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()

                }
            }
        }
    }
}

@Composable
fun CaptainGame(){
    val treasureFound= remember { mutableStateOf(0) }
    val direction= remember { mutableStateOf("North") }
    val stormOrTreasure = remember { mutableStateOf("") }

   Column {
       Text(text = "Treasure found: ${treasureFound.value}")
       Text(text = "Current direction: ${direction.value}")
       Text(text = "${stormOrTreasure.value}")

//       OutlinedTextField(
//           value = "",
//           onValueChange = {},
//           label = { Text(text = "Name")}
//       )
       Button(onClick = {
           direction.value = "South"
           if(Random.nextBoolean()){
               treasureFound.value += 1
               stormOrTreasure.value="We found a Treasure"
           }else{
               stormOrTreasure.value="STORM AHEAD!!"
           }
       }) {
           Text(text = "South")
       }
       Button(onClick = {
           direction.value = "North"
           if(Random.nextBoolean()){
               treasureFound.value += 1
               stormOrTreasure.value="We found a Treasure"
           }else{
               stormOrTreasure.value="STORM AHEAD!!"
           }
       }) {
           Text(text = "North")
       }
       Button(onClick = {
           direction.value = "East"
           if(Random.nextBoolean()){
               treasureFound.value += 1
               stormOrTreasure.value="We found a Treasure"
           }else{
               stormOrTreasure.value="STORM AHEAD!!"
           }
       }) {
           Text(text = "East")
       }
       Button(onClick = {
           direction.value = "West"
           if(Random.nextBoolean()){
               treasureFound.value += 1
               stormOrTreasure.value="We found a Treasure"
           }else{
               stormOrTreasure.value="STORM AHEAD!!"
           }
       }) {
           Text(text = "West")
       }
   }
}

