package com.example.raionacademy

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun RowExample(){
    Text(text = "Kolom 1", color = Color.White, modifier = Modifier.padding(10.dp))
    Text(text = "Kolom 2", color = Color.White, modifier = Modifier.padding(10.dp))
    Text(text = "Kolom 3", color = Color.White, modifier = Modifier.padding(10.dp))
}