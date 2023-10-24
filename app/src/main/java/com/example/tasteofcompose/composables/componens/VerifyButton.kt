package com.example.tasteofcompose.composables.componens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.tasteofcompose.ui.theme.AppTheme

@Composable
fun VerifyButton (buttonText: String){
    Row (
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(AppTheme.colors.primaryTintColor, RoundedCornerShape(10))
            .clickable {}
            .padding(vertical = 10.dp)
            .height(30.dp)
    ){
        Text(
            text = buttonText,
            color = AppTheme.colors.primaryTextInvertColor,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .weight(1F)
        )
    }
}