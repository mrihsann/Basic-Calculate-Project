package com.ihsanarslan.nesnetabanliprogramlama.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun ResultScreen(navController: NavController,result:Float){
    Box (modifier = Modifier.fillMaxSize()){
        IconButton(onClick = {
            navController.navigateUp()
        }) {
            Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "")
        }
        Text(modifier = Modifier.align(Alignment.Center),text = "Hesaplama sonucu : $result")
    }

}