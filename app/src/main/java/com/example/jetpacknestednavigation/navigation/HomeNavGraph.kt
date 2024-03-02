package com.example.jetpacknestednavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpacknestednavigation.ScreenRoutes
import com.example.jetpacknestednavigation.screens.LogoutScreen
import com.example.jetpacknestednavigation.screens.ScreenA
import com.example.jetpacknestednavigation.screens.ScreenB

@Composable
fun HomeNavGraph(
    navController: NavHostController,
    logout: () -> Unit
) {
    NavHost(
        navController = navController,
        route = ScreenRoutes.HomeNav.route,
        startDestination = ScreenRoutes.ScreenA.route
    ) {
        composable(route = ScreenRoutes.ScreenA.route){
            ScreenA(navHostController = navController)
        }
        
        composable(route = ScreenRoutes.ScreenB.route){
            ScreenB(navHostController = navController)
        }
        
        composable(route = ScreenRoutes.LogoutScreen.route){
            LogoutScreen(navHostController = navController, logout = logout)
        }
    }
}