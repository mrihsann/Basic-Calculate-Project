package com.ihsanarslan.nesnetabanliprogramlama.presentation.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.ihsanarslan.nesnetabanliprogramlama.presentation.navigation.Router
import com.ihsanarslan.nesnetabanliprogramlama.presentation.view_model.CalculateScreenViewModel

@Composable
fun CalculateScreen(navController: NavController) {

    val vm : CalculateScreenViewModel = viewModel()

    val sayi1 = remember { mutableStateOf("") } //4
    val sayi2 = remember { mutableStateOf("") } //7
    val sonuc = vm.sonuc.observeAsState()

    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center ,horizontalAlignment = Alignment.CenterHorizontally){
        TextField(value = sayi1.value, onValueChange = { sayi1.value = it })
        TextField(value = sayi2.value, onValueChange = { sayi2.value = it })

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly){
            Button(onClick = {
                vm.topla(sayi1 = sayi1.value, sayi2 = sayi2.value)
            }) {
                Text(text = "+")
            }
            Button(onClick = {
                vm.cikar(sayi1=sayi1.value, sayi2 = sayi2.value)
            }) {
                Text(text = "-")
                }
            Button(onClick = {
                vm.carp(sayi1 = sayi1.value, sayi2 = sayi2.value)
            }) {
                Text(text = "*")
            }
            Button(onClick = {
                vm.bol(sayi1 = sayi1.value, sayi2 = sayi2.value)
            }) {
                Text(text = "/")
            }
        }
        Button(onClick = {
            navController.navigate(Router.Result(result = sonuc.value!!.toFloat()))
        }) {
            Text(text = "Hesapla")
        }

    }
}

@Preview
@Composable
fun PreviewHesapMakinasi(){
    //CalculateScreen()
}