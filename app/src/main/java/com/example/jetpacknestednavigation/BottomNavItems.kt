package com.example.jetpacknestednavigation

sealed class BottomNavItems(
    val title : String,
    val route : String,
    val icon : Int
){
    data object HomeItem : BottomNavItems(
        title = "Home",
        route = ScreenRoutes.HomeScreen.route,
        icon = R.drawable.ic_baseline_home
    )

    data object Profile : BottomNavItems(
        title = "Profile",
        route = ScreenRoutes.LogoutScreen.route,
        icon = R.drawable.ic_account
    )
}