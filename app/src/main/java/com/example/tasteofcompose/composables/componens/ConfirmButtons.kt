package com.example.tasteofcompose.composables.componens


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tasteofcompose.R
import com.example.tasteofcompose.ui.theme.AppTheme


@Composable
fun ConfirmButtons(buttontext: String, buttonHandler: ()->Unit){
    val isChecked = remember {
        mutableStateOf(false)
    }
//    val annotatedString = buildAnnotatedString {
//        append("Copyright ©")
//        appendInlineContent(id = "imageId")
//        append(" 2022 Delizioso")
//    }
//    val inlineContentMap = mapOf(
//        "imageId" to InlineTextContent(
//            Placeholder(24.sp, 24.sp, PlaceholderVerticalAlign.TextCenter)
//        ) {
//            Icon(painterResource(id = R.drawable.copyright), "Copyright", tint = Color.LightGray)
//        }
//    )

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top,
    ) {
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Row (
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ){
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {isChecked.value = !isChecked.value},
                    colors = CheckboxDefaults.colors(
                        checkedColor = AppTheme.colors.primaryTintColor,
                        uncheckedColor = AppTheme.colors.borderColor
                    ),
                    modifier = Modifier.padding(0.dp)
                )
                Text(text = "Remember me", style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(end = 5.dp))
                Text(text = "Forget password?", style = MaterialTheme.typography.bodySmall, textAlign = TextAlign.Center, modifier = Modifier.clickable (onClick = buttonHandler))
            }
            Row (
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clickable { }
                    .background(AppTheme.colors.primaryTintColor, RoundedCornerShape(10))
                    .padding(vertical = 10.dp)
                    .height(30.dp)
            ){
               Text(
                   text = buttontext,
                   color = AppTheme.colors.primaryTextInvertColor,
                   textAlign = TextAlign.Center,
                   modifier = Modifier
                       .weight(1F)

               )
            }
            Row (
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .clickable { }
                    .border(1.dp, AppTheme.colors.borderColor, RoundedCornerShape(10))
                    .padding(
                        start = 12.dp,
                        end = 16.dp,
                        top = 10.dp,
                        bottom = 10.dp
                    )
                    .height(30.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_google_logo),
                    contentDescription = "Google logo",
                    tint = Color.Unspecified
                )
                Text(
                    text = "$buttontext with google",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .weight(1F)
                )
            }
            Spacer(modifier = Modifier.weight(1F))
            Row (
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 100.dp)
            ){
                Text(
                    text = "Copyright © 2022 Delizioso",
                    color = AppTheme.colors.hintTextColor,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .weight(1F)
                )
            }
        }
    }
}


