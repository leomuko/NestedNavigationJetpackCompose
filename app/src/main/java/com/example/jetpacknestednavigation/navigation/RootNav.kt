package com.example.jetpacknestednavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.jetpacknestednavigation.ScreenRoutes
import com.example.jetpacknestednavigation.screens.HomeScreen

@Composable
fun RootNav() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.AuthNav.route
    ) {
        AuthNav(navController)

        composable(route = ScreenRoutes.HomeNav.route){
            HomeScreen(
                logout = {
                    navController.navigate(ScreenRoutes.AuthNav.route) {
                        popUpTo(0){}
                    }
                }
            )
        }
    }
}