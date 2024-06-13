package com.ihsanarslan.nesnetabanliprogramlama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ihsanarslan.nesnetabanliprogramlama.navigation.Navigation
import com.ihsanarslan.nesnetabanliprogramlama.ui.theme.NesneTabanliProgramlamaTheme
import com.ihsanarslan.nesnetabanliprogramlama.views.CalculateScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NesneTabanliProgramlamaTheme {
                Navigation()
            }
        }
    }
}
