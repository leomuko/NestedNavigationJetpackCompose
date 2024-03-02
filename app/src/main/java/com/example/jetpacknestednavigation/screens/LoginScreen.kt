package com.example.jetpacknestednavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.jetpacknestednavigation.ScreenRoutes

@Composable
fun LoginScreen(
    navController: NavHostController
) {
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Login Screen",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Normal,
                fontSize = 22.sp,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.size(100.dp))

            Button(onClick = {
                //Navigate to Home Screen with Separate navhost
                navController.navigate(ScreenRoutes.HomeNav.route)
            }) {
                Text(text = "Go To Home")
            }
        }

    }
}