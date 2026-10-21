package com.sena.clase_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.sena.clase_01.ui.screen.Home
import com.sena.clase_01.ui.theme.Clase_01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Clase_01Theme {
                Home() // Llama a Home sin argumentos
            }
        }
    }
}