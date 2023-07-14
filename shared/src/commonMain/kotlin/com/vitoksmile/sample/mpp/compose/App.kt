package com.vitoksmile.sample.mpp.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun App(
    modifier: Modifier = Modifier,
) {
    AppTheme {
        Surface(
            modifier = modifier.fillMaxSize(),
        ) {
            Text(Greeting().greet())
        }
    }
}