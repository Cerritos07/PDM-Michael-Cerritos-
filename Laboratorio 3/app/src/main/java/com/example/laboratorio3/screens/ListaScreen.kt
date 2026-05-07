package com.example.laboratorio3.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.navigation.NavController

@Composable
fun ListaScreen(navController: NavController) {

    Column(modifier = Modifier.padding(20.dp)) {

        TextoLista()

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.popBackStack() }) {
            Text("Volver")
        }
    }
}

@Composable
fun TextoLista() {

    var nombre by remember { mutableStateOf("") }
    var lista by remember { mutableStateOf(listOf<String>()) }

    Column {

        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            placeholder = { Text("Escriba un nombre") }
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            Button(
                onClick = {
                    if (nombre != "") {
                        lista = lista + nombre
                        nombre = ""
                    }
                },
                modifier = Modifier.height(40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF3F51B5),
                    contentColor = Color.White
                )
            ) {
                Text("Guardar")
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Listado de nombres y posición en la lista",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.weight(1f)
            )

            Button(
                onClick = { lista = listOf() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF3F51B5),
                    contentColor = Color.White
                ),
                modifier = Modifier.padding(start = 10.dp)
            ) {
                Text("Limpiar")
            }
        }

        LazyColumn(modifier = Modifier.padding(top = 15.dp)) {
            item {
                lista.forEachIndexed { i, valor ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(valor)
                        Text("No. ${i + 1}")
                    }
                }
            }
        }
    }
}