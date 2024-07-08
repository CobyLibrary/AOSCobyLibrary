package com.coby.cobyds.Theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme

object Semantic {

    // Static
    @Composable
    fun staticWhite(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFFFFFF) else Color(0xFFFFFFFF)
    }

    @Composable
    fun staticBlack(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF000000) else Color(0xFF000000)
    }

    // Label
    @Composable
    fun labelNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFF7F7F8) else Color(0xFF171718)
    }

    @Composable
    fun labelStrong(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFFFFFF) else Color(0xFF000000)
    }

    @Composable
    fun labelNeutral(): Color {
        return if (isSystemInDarkTheme()) Color(0xC2C4C8).copy(alpha = 0.88f) else Color(0xFF292A2D).copy(alpha = 0.88f)
    }

    @Composable
    fun labelAlternative(): Color {
        return if (isSystemInDarkTheme()) Color(0xAEB0B6).copy(alpha = 0.61f) else Color(0xFF3C383C).copy(alpha = 0.61f)
    }

    @Composable
    fun labelAssistive(): Color {
        return if (isSystemInDarkTheme()) Color(0xAEB0B6).copy(alpha = 0.28f) else Color(0xFF3C383C).copy(alpha = 0.28f)
    }

    @Composable
    fun labelDisable(): Color {
        return if (isSystemInDarkTheme()) Color(0x989BA2).copy(alpha = 0.16f) else Color(0xFF3C383C).copy(alpha = 0.16f)
    }

    // Background
    @Composable
    fun backgroundNormalNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF1B1C1E) else Color(0xFFFFFFFF)
    }

    @Composable
    fun backgroundNormalAlternative(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF0F0F10) else Color(0xFFF7F7F8)
    }

    @Composable
    fun backgroundElevatedNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF212225) else Color(0xFFFFFFFF)
    }

    @Composable
    fun backgroundElevatedAlternative(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF141415) else Color(0xFFF7F7F8)
    }

    // Interaction
    @Composable
    fun interactionInactive(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF5A5C63) else Color(0xFF989BA2)
    }

    @Composable
    fun interactionDisable(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF2E2F33) else Color(0xFFF4F4F5)
    }

    // Line
    @Composable
    fun lineNormalNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF70737C).copy(alpha = 0.32f) else Color(0xFF70737C).copy(alpha = 0.22f)
    }

    @Composable
    fun lineNormalNeutral(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF70737C).copy(alpha = 0.28f) else Color(0xFF70737C).copy(alpha = 0.16f)
    }

    @Composable
    fun lineNormalAlternative(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF70737C).copy(alpha = 0.22f) else Color(0xFF70737C).copy(alpha = 0.08f)
    }

    @Composable
    fun lineSolidNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF3C383C) else Color(0xFFE1E2E4)
    }

    @Composable
    fun lineSolidNeutral(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF333438) else Color(0xFFEAEBEC)
    }

    @Composable
    fun lineSolidAlternative(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF2E2F33) else Color(0xFFF4F4F5)
    }

    // Status
    @Composable
    fun statusPositive(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF1ED45A) else Color(0xFF00BF40)
    }

    @Composable
    fun statusCautionary(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFFA938) else Color(0xFFFF9200)
    }

    @Composable
    fun statusNegative(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFF6363) else Color(0xFFFF4242)
    }

    // Accent
    @Composable
    fun accentLime(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF6BE016) else Color(0xFF58CF04)
    }

    @Composable
    fun accentCyan(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF28D0ED) else Color(0xFF00BDDE)
    }

    @Composable
    fun accentLightBlue(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF3DC2FF) else Color(0xFF00AEFF)
    }

    @Composable
    fun accentViolet(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF7D5EF7) else Color(0xFF6541F2)
    }

    @Composable
    fun accentPurple(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFD478FF) else Color(0xFFCB59FF)
    }

    @Composable
    fun accentPink(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFA73E3) else Color(0xFFF553DA)
    }

    // Inverse
    @Composable
    fun inversePrimary(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF0066FF) else Color(0xFF3385FF)
    }

    @Composable
    fun inverseBackground(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFFFFFF) else Color(0xFF1B1C1E)
    }

    @Composable
    fun inverseLabel(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF171718) else Color(0xFFF7F7F8)
    }

    // Fill
    @Composable
    fun fillNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF70737C).copy(alpha = 0.22f) else Color(0xFF70737C).copy(alpha = 0.08f)
    }

    @Composable
    fun fillStrong(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF70737C).copy(alpha = 0.28f) else Color(0xFF70737C).copy(alpha = 0.16f)
    }

    @Composable
    fun fillAlternative(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF70737C).copy(alpha = 0.12f) else Color(0xFF70737C).copy(alpha = 0.05f)
    }

    // Material
    @Composable
    fun materialDimmer(): Color {
        return if (isSystemInDarkTheme()) Color(0xFF171718).copy(alpha = 0.74f) else Color(0xFF171718).copy(alpha = 0.52f)
    }

    // Shadow
    @Composable
    fun shadowNormal(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFFFFFF).copy(alpha = 0.16f) else Color(0xFF000000).copy(alpha = 0.16f)
    }

    @Composable
    fun shadowEmphasize(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFFFFFF).copy(alpha = 0.22f) else Color(0xFF000000).copy(alpha = 0.22f)
    }

    @Composable
    fun shadowStrong(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFFFFFF).copy(alpha = 0.22f) else Color(0xFF000000).copy(alpha = 0.22f)
    }

    @Composable
    fun shadowHeavy(): Color {
        return if (isSystemInDarkTheme()) Color(0xFFFFFFFF).copy(alpha = 0.28f) else Color(0xFF000000).copy(alpha = 0.28f)
    }
}
