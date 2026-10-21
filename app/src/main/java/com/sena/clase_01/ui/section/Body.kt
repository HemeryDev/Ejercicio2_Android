package com.sena.clase_01.ui.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.clase_01.R
import com.sena.clase_01.ui.composable.CategoriaItem
import com.sena.clase_01.ui.composable.PrimaryText
import com.sena.clase_01.ui.composable.SecondaryText

private data class CategoriaDato(
    val nombre: String,
    val emoji: String,
    val colorFondo: Color,
    val colorTexto: Color
)

@Composable
fun Body() {
    val categorias = listOf(
        CategoriaDato("Montaña", "⛰️", Color(0xFFEDE9FE), Color(0xFF7C3AED)),
        CategoriaDato("Bosque", "🌲", Color(0xFFDCFCE7), Color(0xFF16A34A)),
        CategoriaDato("Playa", "🏖️", Color(0xFFE0F2FE), Color(0xFF0284C7)),
        CategoriaDato("Ciudad", "🏛️", Color(0xFFFFEDD5), Color(0xFFEA580C)),
        CategoriaDato("Favoritos", "❤️", Color(0xFFFCE7F3), Color(0xFFEC4899))
    )

    Column(modifier = Modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .padding(horizontal = 20.dp),
            shape = RoundedCornerShape(18.dp)
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                // 1. Imagen de fondo corregida (ContentScale.Crop, fillMaxSize, painterResource)
                Image(
                    painter = painterResource(id = R.drawable.img_ciudad),
                    contentDescription = "Explora",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )

                // 2. Capa oscura degradada por encima de la imagen
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.70f)),
                                startY = 70f
                            )
                        )
                )

                // 3. Textos sobre la imagen y el gradiente
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(16.dp)
                ) {
                    PrimaryText(text = "Explora", color = Color.White, fontSize = 22.sp)
                    SecondaryText(text = "Lugares increíbles cerca de ti", color = Color(0xFFF1F5F9))
                }
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(horizontal = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(categorias) { cat ->
                CategoriaItem(
                    title = cat.nombre,
                    simbolo = cat.emoji,
                    bgColor = cat.colorFondo,
                    textColor = cat.colorTexto
                )
            }
        }
    }
}