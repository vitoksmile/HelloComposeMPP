package com.vitoksmile.sample.mpp.compose

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        with(window) {
            setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }
        setContent {
            // Wrap with AppTheme & Surface to draw above status bar and below navigation bars,
            // but keeping app theme background
            AppTheme {
                Surface {
                    App(
                        modifier = Modifier
                            .statusBarsPadding()
                            .navigationBarsPadding(),
                    )
                }
            }
        }
    }
}