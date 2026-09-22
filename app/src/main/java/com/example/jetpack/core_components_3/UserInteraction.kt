package com.example.jetpack.core_components_3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SelectedTextSample() {
    SelectionContainer(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Hi, this is the text we are seeing")
            Text("you can select the upper portion")
            DisableSelection {
                Text("You can not select this part haha")
            }
            Text("You can surely select this one maybe")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LinkedTextSample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        val uriHandler = LocalUriHandler.current
        Text(
            buildAnnotatedString {
                append("Hi, I am Aryan Rohela. Here, I am going to learn")
                val link = LinkAnnotation.Url(
                    "https://developer.android.com/design/ui/mobile",
                    TextLinkStyles(
                        SpanStyle(color = Color.Blue)
                    )
                ) {
                    val url = (it as LinkAnnotation.Url).url
                    uriHandler.openUri(url)
                }
                withLink(link) {
                    append("Jetpack Compose")
                }
            }
        )
    }
}
