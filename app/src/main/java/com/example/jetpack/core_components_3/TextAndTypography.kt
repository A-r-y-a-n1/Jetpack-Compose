package com.example.jetpack.core_components_3

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun SimpleText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Hello Jetpack",
            color = Color.Red,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                fontSize = 40.sp,
                shadow = Shadow(color = Color.Black, blurRadius = 20f)
            )
        )
    }
}


@Composable
fun ColorFullText() {
    val rainbowColors = listOf(Color.Blue, Color.Blue, Color.Green, Color.Cyan, Color.Magenta)
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = buildAnnotatedString {
            append("Keep working, one day we will succeed \n")
            withStyle(
                SpanStyle(brush = Brush.linearGradient(colors = rainbowColors))
            ) {
                append("because luck will someday be on our side \n")
            }
            append("Just keep working hard for it")
        }, fontSize = 20.sp)
    }
}

@Composable
@Preview(showSystemUi = true)
fun BasicMarquee() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hey we are going to create a marquee effect for experimentation if it really works or not",
            modifier = Modifier.basicMarquee(),
            fontSize = 20.sp
        )
    }
}
