package com.example.tasteofcompose.composables.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.tasteofcompose.LoginViewModel
import com.example.tasteofcompose.composables.componens.Circle
import com.example.tasteofcompose.composables.componens.ConfirmButtons
import com.example.tasteofcompose.composables.componens.EmailTextField
import com.example.tasteofcompose.composables.componens.PasswordTextField
import com.example.tasteofcompose.composables.componens.SigLog

@Composable
fun LogInScreen(navController: NavController) {

    val handleNavSign = {
        navController.navigate(Destinations.SignUp.name)
    }
    val handleNavForgot = {
        navController.navigate(Destinations.Forgot.name)
    }
    val loginViewModel: LoginViewModel = viewModel()
    val viewState = loginViewModel.loginViewModelState.collectAsState()

    Circle()
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(80.dp)
    ){
        SigLog("Log in", "Already have an account?", " Sign up", handleNavSign)
        EmailTextField("Email address")
        Log.d("hehe", viewState.value.email)
        PasswordTextField("Password")
        ConfirmButtons("Log in", handleNavForgot)
    }



}