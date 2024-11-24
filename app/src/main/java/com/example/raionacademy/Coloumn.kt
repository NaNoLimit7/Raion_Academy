package com.example.raionacademy

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun ColoumnExample(){
    Column {
        Text(text = "Kolom 1", color = Color.White)
        Text(text = "Kolom 1", color = Color.White)
        Text(text = "Kolom 1", color = Color.White)
    }

}
