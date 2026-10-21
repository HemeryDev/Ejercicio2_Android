package com.sena.clase_01.ui.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.clase_01.R
import com.sena.clase_01.ui.composable.PrimaryText
import com.sena.clase_01.ui.composable.SecondaryText

@Composable
fun Header() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF4338CA))
            .statusBarsPadding()
            .padding(horizontal = 20.dp, vertical = 20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                PrimaryText(
                    text = "Descubre",
                    fontSize = 24.sp,
                    color = Color.White
                )
                SecondaryText(
                    text = "Nuevos destinos, nuevas historias",
                    color = Color(0xFFE0E7FF)
                )
            }

            // Avatar circular con la imagen real img_explora
            Box(
                modifier = Modifier
                    .size(52.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.White, CircleShape)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_explora),
                    contentDescription = "Avatar de usuario",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}