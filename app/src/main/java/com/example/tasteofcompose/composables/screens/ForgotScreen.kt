package com.example.tasteofcompose.composables.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.tasteofcompose.LoginViewModel
import com.example.tasteofcompose.composables.componens.Circle
import com.example.tasteofcompose.composables.componens.ConfirmButtons
import com.example.tasteofcompose.composables.componens.EmailTextField
import com.example.tasteofcompose.composables.componens.ForgotTextField
import com.example.tasteofcompose.composables.componens.PasswordTextField
import com.example.tasteofcompose.composables.componens.SigLog
import com.example.tasteofcompose.composables.componens.SubmitButton

@Composable
fun ForgotScreen(navController: NavController){
    val handleNavVerify = {
        navController.navigate(Destinations.Verify.name)
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
        Text(text = "Please enter your email address to receive a verification code", textAlign = TextAlign.Center )
        ForgotTextField("Email address")
        Log.d("hehe", viewState.value.email)
        Log.d("hehe", viewState.value.forgotEmail)
        if(viewState.value.forgotEmail == viewState.value.email){
            SubmitButton("Submit", handleNavVerify)
        }


    }
}