package com.example.tasteofcompose.composables.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tasteofcompose.composables.componens.Circle
import com.example.tasteofcompose.composables.componens.EmailTextField
import com.example.tasteofcompose.composables.componens.NumberTextField
import com.example.tasteofcompose.composables.componens.SubmitButton
import com.example.tasteofcompose.composables.componens.VerifyButton

@Composable
fun VerifyScreen(navController: NavController){
    val onSubmit = remember {
        mutableStateOf(true)
    }
    val but = remember {
        mutableStateOf("")
    }

    Circle()
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(80.dp)
    ){
        Text(text = "Please enter the verification code we sent to your email address", textAlign = TextAlign.Center )
        NumberTextField()
        VerifyButton("Verify")

    }
}