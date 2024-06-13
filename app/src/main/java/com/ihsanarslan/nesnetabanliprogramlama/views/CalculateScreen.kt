package com.ihsanarslan.nesnetabanliprogramlama.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ihsanarslan.nesnetabanliprogramlama.navigation.Router
import com.ihsanarslan.nesnetabanliprogramlama.use_case.BolUseCase
import com.ihsanarslan.nesnetabanliprogramlama.use_case.CarpUseCase
import com.ihsanarslan.nesnetabanliprogramlama.use_case.CikarUseCase
import com.ihsanarslan.nesnetabanliprogramlama.use_case.ToplaUseCase

@Composable
fun CalculateScreen(navController: NavController) {
    val toplaUseCase = ToplaUseCase()
    val cikarUseCase = CikarUseCase()
    val carpUseCase = CarpUseCase()
    val bolUseCase = BolUseCase()
    val sayi1 = remember { mutableStateOf("") }
    val sayi2 = remember { mutableStateOf("") }
    val sonuc = remember { mutableDoubleStateOf(0.0) }

    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center ,horizontalAlignment = Alignment.CenterHorizontally){
        TextField(value = sayi1.value, onValueChange = { sayi1.value = it })
        TextField(value = sayi2.value, onValueChange = { sayi2.value = it })

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly){
            Button(onClick = {
                val yeniDeger = toplaUseCase(sayi1 = sayi1.value.toInt(), sayi2 = sayi2.value.toInt())
                sonuc.doubleValue = yeniDeger.toDouble()
            }) {
                Text(text = "+")
            }
            Button(onClick = {
                val yeniDeger= cikarUseCase(sayi1 = sayi1.value.toInt(), sayi2 = sayi2.value.toInt())
                sonuc.doubleValue = yeniDeger.toDouble()
            }) {
                Text(text = "-")
                }
            Button(onClick = {
                val yeniDeger= carpUseCase(sayi1 = sayi1.value.toInt(), sayi2 = sayi2.value.toInt())
                sonuc.doubleValue = yeniDeger.toDouble()
            }) {
                Text(text = "*")
            }
            Button(onClick = {
                val yeniDeger= bolUseCase(sayi1 = sayi1.value.toDouble(), sayi2 = sayi2.value.toDouble())
                sonuc.doubleValue = yeniDeger
            }) {
                Text(text = "/")
            }
        }
        Button(onClick = {
            navController.navigate(Router.Result(result = sonuc.doubleValue.toFloat()))
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