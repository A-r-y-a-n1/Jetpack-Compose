package com.example.jetpack.core_components_3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpack.R


@Composable
fun ImageSample() {
    Image(
        modifier = Modifier
            .size(300.dp)
            .clip(CircleShape),
        painter = painterResource(R.drawable.img),
        contentDescription = "",
        contentScale = ContentScale.FillBounds,
        alignment = Alignment.Center,
        colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(5f) })
    )
}