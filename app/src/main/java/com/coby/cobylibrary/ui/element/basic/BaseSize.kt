package com.coby.cobylibrary.ui.element.basic

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

object BaseSize {
    val horizontalPadding: Dp = 24.dp
    val verticalPadding: Dp = 20.dp
    val cellHorizontalSpacing: Dp = 12.dp
    val cellVerticalSpacing: Dp = 16.dp

    @Composable
    fun screenWidth(): Dp {
        val configuration = LocalConfiguration.current
        return with(LocalDensity.current) { configuration.screenWidthDp.dp }
    }

    @Composable
    fun screenHeight(): Dp {
        val configuration = LocalConfiguration.current
        return with(LocalDensity.current) { configuration.screenHeightDp.dp }
    }

    @Composable
    fun fullWidth(): Dp {
        return screenWidth() - horizontalPadding * 2
    }

    @Composable
    fun cellWidth(): Dp {
        return (fullWidth() - cellHorizontalSpacing) / 2
    }
}