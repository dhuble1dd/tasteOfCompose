package com.example.tasteofcompose.composables.componens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tasteofcompose.ui.theme.AppTheme

@Composable
fun SigLog(headerText: String, hintText: String, buttonText: String, buttonHandler: ()->Unit){
    Row {
        Column {
            Text(text = headerText, fontSize = 30.sp, fontWeight = FontWeight.Bold)
            Row {
                Text(text = hintText, fontSize = 10.sp)
                Text(text = buttonText, fontSize = 10.sp, color = AppTheme.colors.actionTextColor, modifier = Modifier.clickable(onClick = buttonHandler))
            }
        }
    }
}