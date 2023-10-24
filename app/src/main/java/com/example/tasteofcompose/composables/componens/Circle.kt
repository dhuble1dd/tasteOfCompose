package com.example.tasteofcompose.composables.componens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.tasteofcompose.ui.theme.AppTheme


@Composable
fun Circle(){
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top,
        modifier = Modifier
            .padding(20.dp)
            .background(AppTheme.colors.primaryTintColor, RoundedCornerShape(50))
            .width(20.dp)
            .height(20.dp)


    ){
        Text(text = "D", color = AppTheme.colors.primaryTextInvertColor)
    }
}