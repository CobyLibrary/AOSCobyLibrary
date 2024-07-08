package com.coby.cobyds.Theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme

object Primary {

    // Blue
    @Composable
    fun blueNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF3385FF) else Color(0xFF0066FF)
    }

    @Composable
    fun blueStrong(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF1A75FF) else Color(0xFF005EEB)
    }

    @Composable
    fun blueHeavy(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF0066FF) else Color(0xFF0054D1)
    }

    // Red
    @Composable
    fun redNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFF6363) else Color(0xFFFF4242)
    }

    @Composable
    fun redHeavy(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFF4242) else Color(0xFFE52222)
    }

    // Green
    @Composable
    fun greenNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF1ED45A) else Color(0xFF00BF40)
    }

    @Composable
    fun greenHeavy(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF00BF40) else Color(0xFF009632)
    }

    // Orange
    @Composable
    fun orangeNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFFA938) else Color(0xFFFF9200)
    }

    @Composable
    fun orangeHeavy(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFF9200) else Color(0xFFD47800)
    }

    // RedOrange
    @Composable
    fun redOrangeNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFF7B2E) else Color(0xFFFF5E00)
    }

    @Composable
    fun redOrangeHeavy(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFF5E00) else Color(0xFFC94A00)
    }

    // Lime
    @Composable
    fun limeNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF6BE016) else Color(0xFF58CF04)
    }

    @Composable
    fun limeHeavy(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF58CF04) else Color(0xFF48AD00)
    }

    // Cyan
    @Composable
    fun cyanNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF28D0ED) else Color(0xFF00BDDE)
    }

    @Composable
    fun cyanHeavy(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF00BDDE) else Color(0xFF0098B2)
    }

    // LightBlue
    @Composable
    fun lightBlueNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF3DC2FF) else Color(0xFF00AEFF)
    }

    @Composable
    fun lightBlueHeavy(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF00AEFF) else Color(0xFF008DCF)
    }

    // Violet
    @Composable
    fun violetNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF7D5EF7) else Color(0xFF6541F2)
    }

    @Composable
    fun violetHeavy(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF6541F2) else Color(0xFF4F29E5)
    }

    // Purple
    @Composable
    fun purpleNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFD478FF) else Color(0xFFCB59FF)
    }

    @Composable
    fun purpleHeavy(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFCB59FF) else Color(0xFFAD36E3)
    }

    // Pink
    @Composable
    fun pinkNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFA73E3) else Color(0xFFF553DA)
    }

    @Composable
    fun pinkHeavy(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFF553DA) else Color(0xFFD331B8)
    }
}
