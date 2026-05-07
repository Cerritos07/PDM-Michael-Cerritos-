package com.example.laboratorio3.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Menú Principal")

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate("lista") }) {
            Text("Ver lista de nombres")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { navController.navigate("sensor") }) {
            Text("Ver sensores")
        }
    }
}
