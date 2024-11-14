package com.example.myjetpackcomposeapp

sealed class Screen(val route: String, val title: String) {
    object List1 : Screen("list1", "List 1")
    object List2 : Screen("list2", "List 2")
    object About : Screen("about", "About")
}