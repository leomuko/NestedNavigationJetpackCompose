package com.example.jetpacknestednavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.jetpacknestednavigation.ScreenRoutes
import com.example.jetpacknestednavigation.screens.LoginScreen
import com.example.jetpacknestednavigation.screens.StartScreen


fun NavGraphBuilder.AuthNav(
    navController: NavHostController
) {
    navigation(
        startDestination = ScreenRoutes.StartScreen.route,
        route = ScreenRoutes.AuthNav.route
    ){
        composable(route = ScreenRoutes.StartScreen.route){
            StartScreen(navController = navController)
        }
        
        composable(route = ScreenRoutes.LoginScreen.route){
            LoginScreen(navController = navController)
        }
    }
}