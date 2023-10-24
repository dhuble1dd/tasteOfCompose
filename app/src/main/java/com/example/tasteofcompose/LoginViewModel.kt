package com.example.tasteofcompose

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class LoginViewModelState(
    var username: String = "",
    var password: String = "",
    var email: String = "",
    var forgotEmail: String = ""
)
class LoginViewModel: ViewModel() {

    private val _loginViewModelState = MutableStateFlow(LoginViewModelState())
    val loginViewModelState: StateFlow<LoginViewModelState> = _loginViewModelState


    fun changeUserName(username: String){
        _loginViewModelState.value = _loginViewModelState.value.copy(username = username)
    }
    fun changePassword(password: String){
        _loginViewModelState.value = _loginViewModelState.value.copy(password = password)
    }
    fun changeEmail(email: String){
        _loginViewModelState.value = _loginViewModelState.value.copy(email = email)
    }
    fun changeForgotEmail(forgotEmail: String){
        _loginViewModelState.value = _loginViewModelState.value.copy(forgotEmail = forgotEmail)
    }
}