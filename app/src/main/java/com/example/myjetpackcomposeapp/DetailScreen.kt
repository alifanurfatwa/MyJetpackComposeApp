package com.example.myjetpackcomposeapp

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DetailScreen(item: String?) {
    Text(text = "Detail of $item")
    // Tambahkan informasi lebih lanjut tentang item di sini
}