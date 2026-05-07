package com.example.laboratorio3.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.laboratorio3.screens.*

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {

        composable("home") {
            HomeScreen(navController)
        }

        composable("lista") {
            ListaScreen(navController)
        }

        composable("sensor") {
            SensorScreen(navController)
        }
    }
}