package com.example.myjetpackcomposeapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ListScreen(navController: NavController, screenNumber: Int) {
    when (screenNumber) {
        1 -> {
            LazyColumn {
                items(10) { index ->
                    ItemCard("Item $index") {
                        navController.navigate("detail/$index")
                    }
                }
            }
            LazyRow {
                items(10) { index ->
                    ItemCard("Item $index") {
                        navController.navigate("detail/$index")
                    }
                }
            }
        }
        2 -> {
            LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                items(10) { index ->
                    ItemCard("Item $index") {
                        navController.navigate("detail/$index")
                    }
                }
            }
        }
    }
}

@Composable
fun ItemCard(text: String, onClick: () -> Unit) {
    Card(onClick = onClick) {
        Text(text)
    }
}