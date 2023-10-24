package com.example.tasteofcompose.composables.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


enum class Destinations{
    Login,
    SignUp,
    Forgot,
    Verify
}
@Composable
fun MainScreen() {
    val navController = rememberNavController()



    NavHost(navController = navController, startDestination = Destinations.Login.name) {
        composable(Destinations.Login.name) {
            LogInScreen(navController = navController) }
        composable(Destinations.SignUp.name) {
            SignUpScreen(navController = navController) }
        composable(Destinations.Forgot.name) {
            ForgotScreen(navController = navController)}
        composable(Destinations.Verify.name) {
            VerifyScreen(navController = navController)
        }
    }
}