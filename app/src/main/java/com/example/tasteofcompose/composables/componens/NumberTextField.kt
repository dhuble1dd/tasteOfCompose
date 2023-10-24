package com.example.tasteofcompose.composables.componens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tasteofcompose.LoginViewModel
import com.example.tasteofcompose.ui.theme.AppTheme

@Composable
fun NumberTextField (){
    val text = remember {
        mutableStateOf("")
    }
    val loginViewModel: LoginViewModel = viewModel()
    val viewState = loginViewModel.loginViewModelState.collectAsState()
    OutlinedTextField(
        value = text.value,
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = AppTheme.colors.primaryTintColor,
            cursorColor = AppTheme.colors.primaryTintColor,
            disabledBorderColor = AppTheme.colors.borderColor,
            disabledTextColor = AppTheme.colors.hintTextColor,
            focusedTextColor = AppTheme.colors.primaryTextColor,
            disabledLabelColor = AppTheme.colors.hintTextColor,
            focusedLabelColor = AppTheme.colors.primaryTintColor
        ),
        onValueChange = { text.value = it},
        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}