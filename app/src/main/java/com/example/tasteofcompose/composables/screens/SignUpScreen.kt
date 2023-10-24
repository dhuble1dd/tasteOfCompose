package com.example.tasteofcompose.composables.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tasteofcompose.composables.componens.Circle
import com.example.tasteofcompose.composables.componens.ConfirmButtons
import com.example.tasteofcompose.composables.componens.EmailTextField
import com.example.tasteofcompose.composables.componens.NameTextField
import com.example.tasteofcompose.composables.componens.PasswordTextField
import com.example.tasteofcompose.composables.componens.SigLog

@Composable
fun SignUpScreen(navController: NavController) {

    val handleNavLog = {
        navController.navigate(Destinations.Login.name)
    }
    val handleNavForgot = {
        navController.navigate(Destinations.Forgot.name)
    }

    Circle()
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(80.dp)
    ){
        SigLog("Sign Up", "Don't have an account?", " Log in", handleNavLog)
        NameTextField("Full name")
        EmailTextField("Email address")
        PasswordTextField("Password")
        ConfirmButtons("Sign Up", handleNavForgot)
    }



}

