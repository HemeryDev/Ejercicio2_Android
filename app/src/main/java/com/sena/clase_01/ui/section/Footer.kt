package com.sena.clase_01.ui.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.clase_01.R
import com.sena.clase_01.ui.composable.PrimaryText
import com.sena.clase_01.ui.composable.SecondaryText

private data class DestinoItemUI(
    val title: String,
    val category: String,
    val rating: String,
    val desc: String,
    val imagenRes: Int
)

@Composable
fun Footer() {
    val destinos = listOf(
        DestinoItemUI(
            title = "Laguna Azul",
            category = "Naturaleza",
            rating = "4.8",
            desc = "Un paraíso natural rodeado de montañas.",
            imagenRes = R.drawable.img_laguna
        ),
        DestinoItemUI(
            title = "Playa del Sol",
            category = "Playa",
            rating = "4.6",
            desc = "Aguas cristalinas y arena blanca.",
            imagenRes = R.drawable.img_playa
        ),
        DestinoItemUI(
            title = "Centro Histórico",
            category = "Cultura",
            rating = "4.7",
            desc = "Historia y arquitectura en un solo lugar.",
            imagenRes = R.drawable.img_ciudad
        )
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PrimaryText(text = "Destinos populares", fontSize = 18.sp)
            SecondaryText(
                text = "Ver todos",
                color = Color(0xFF4F46E5),
                modifier = Modifier.clickable { }
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            destinos.forEach { item ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFF8FAFC))
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Imagen real del destino
                        Image(
                            painter = painterResource(id = item.imagenRes),
                            contentDescription = item.title,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(70.dp)
                                .clip(RoundedCornerShape(12.dp))
                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        Column(modifier = Modifier.weight(1f)) {
                            PrimaryText(text = item.title, fontSize = 15.sp)
                            Spacer(modifier = Modifier.height(2.dp))
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                SecondaryText(text = item.category, fontSize = 12.sp)
                                SecondaryText(text = " • ", fontSize = 12.sp)
                                Text(
                                    text = "★",
                                    fontSize = 12.sp,
                                    color = Color(0xFFF59E0B)
                                )
                                Text(
                                    text = " ${item.rating}",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color(0xFF334155)
                                )
                            }
                            Spacer(modifier = Modifier.height(3.dp))
                            SecondaryText(text = item.desc, fontSize = 12.sp)
                        }

                        Text(
                            text = "›",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Light,
                            color = Color(0xFF94A3B8),
                            modifier = Modifier.padding(end = 4.dp)
                        )
                    }
                }
            }
        }
    }
}