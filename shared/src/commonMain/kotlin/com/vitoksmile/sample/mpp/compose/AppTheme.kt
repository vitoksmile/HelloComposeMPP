package com.vitoksmile.sample.mpp.compose

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AppTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        content = content,
    )
}