package com.example.tasteofcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.SideEffect
import com.example.tasteofcompose.composables.screens.MainScreen
import com.example.tasteofcompose.ui.theme.AppTheme

import com.example.tasteofcompose.ui.theme.TasteOfComposeTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
//            SignUpScreen()
//            LogInScreen()
            TasteOfComposeTheme {
                val systemUiController = rememberSystemUiController()

                // Set status bar color
                val primaryBackground = AppTheme.colors.primaryBackground
                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = primaryBackground,
                        darkIcons = true
                    )
                }
                MainScreen()
            }

        }
    }
}

