package com.sena.clase_01.ui.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun SecondaryText(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 13.sp,
    color: Color = Color(0xFF64748B)
) {
    Text(
        text = text,
        modifier = modifier,
        fontSize = fontSize,
        color = color
    )
}