package com.example.raionacademy

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun BoxExample(){
Column {

    Text(text = "Baris 1", color = Color.White)
    Text(text = "Baris 2", color = Color.White)
    Text(text = "Baris 3", color = Color.White)
}
}