package com.coby.cobyds.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme

@Composable
fun Color.Companion.staticWhite(): Color {
    return if (isSystemInDarkTheme()) common100 else common100
}

@Composable
fun Color.Companion.staticBlack(): Color {
    return if (isSystemInDarkTheme()) common0 else common0
}

// Label
@Composable
fun Color.Companion.labelNormal(): Color {
    return if (isSystemInDarkTheme()) coolNeutral99 else coolNeutral10
}

@Composable
fun Color.Companion.labelStrong(): Color {
    return if (isSystemInDarkTheme()) common100 else common0
}

@Composable
fun Color.Companion.labelNeutral(): Color {
    return if (isSystemInDarkTheme()) coolNeutral90.copy(alpha = 0.88f) else coolNeutral22.copy(alpha = 0.88f)
}

@Composable
fun Color.Companion.labelAlternative(): Color {
    return if (isSystemInDarkTheme()) coolNeutral80.copy(alpha = 0.61f) else coolNeutral25.copy(alpha = 0.61f)
}

@Composable
fun Color.Companion.labelAssistive(): Color {
    return if (isSystemInDarkTheme()) coolNeutral80.copy(alpha = 0.28f) else coolNeutral25.copy(alpha = 0.28f)
}

@Composable
fun Color.Companion.labelDisable(): Color {
    return if (isSystemInDarkTheme()) coolNeutral70.copy(alpha = 0.16f) else coolNeutral25.copy(alpha = 0.16f)
}

// Background
@Composable
fun Color.Companion.backgroundNormalNormal(): Color {
    return if (isSystemInDarkTheme()) coolNeutral15 else common100
}

@Composable
fun Color.Companion.backgroundNormalAlternative(): Color {
    return if (isSystemInDarkTheme()) coolNeutral5 else coolNeutral99
}

@Composable
fun Color.Companion.backgroundElevatedNormal(): Color {
    return if (isSystemInDarkTheme()) coolNeutral17 else common100
}

@Composable
fun Color.Companion.backgroundElevatedAlternative(): Color {
    return if (isSystemInDarkTheme()) coolNeutral7 else coolNeutral99
}

// Interaction
@Composable
fun Color.Companion.interactionInactive(): Color {
    return if (isSystemInDarkTheme()) coolNeutral40 else coolNeutral70
}

@Composable
fun Color.Companion.interactionDisable(): Color {
    return if (isSystemInDarkTheme()) coolNeutral22 else coolNeutral98
}

// Line
@Composable
fun Color.Companion.lineNormalNormal(): Color {
    return if (isSystemInDarkTheme()) coolNeutral50.copy(alpha = 0.32f) else coolNeutral50.copy(alpha = 0.22f)
}

@Composable
fun Color.Companion.lineNormalNeutral(): Color {
    return if (isSystemInDarkTheme()) coolNeutral50.copy(alpha = 0.28f) else coolNeutral50.copy(alpha = 0.16f)
}

@Composable
fun Color.Companion.lineNormalAlternative(): Color {
    return if (isSystemInDarkTheme()) coolNeutral50.copy(alpha = 0.22f) else coolNeutral50.copy(alpha = 0.08f)
}

@Composable
fun Color.Companion.lineSolidNormal(): Color {
    return if (isSystemInDarkTheme()) coolNeutral25 else coolNeutral96
}

@Composable
fun Color.Companion.lineSolidNeutral(): Color {
    return if (isSystemInDarkTheme()) coolNeutral23 else coolNeutral97
}

@Composable
fun Color.Companion.lineSolidAlternative(): Color {
    return if (isSystemInDarkTheme()) coolNeutral22 else coolNeutral98
}

// Status
@Composable
fun Color.Companion.statusPositive(): Color {
    return if (isSystemInDarkTheme()) green60 else green50
}

@Composable
fun Color.Companion.statusCautionary(): Color {
    return if (isSystemInDarkTheme()) orange60 else orange50
}

@Composable
fun Color.Companion.statusNegative(): Color {
    return if (isSystemInDarkTheme()) red60 else red50
}

// Accent
@Composable
fun Color.Companion.accentLime(): Color {
    return if (isSystemInDarkTheme()) lime60 else lime50
}

@Composable
fun Color.Companion.accentCyan(): Color {
    return if (isSystemInDarkTheme()) cyan60 else cyan50
}

@Composable
fun Color.Companion.accentLightBlue(): Color {
    return if (isSystemInDarkTheme()) lightBlue60 else lightBlue50
}

@Composable
fun Color.Companion.accentViolet(): Color {
    return if (isSystemInDarkTheme()) violet60 else violet50
}

@Composable
fun Color.Companion.accentPurple(): Color {
    return if (isSystemInDarkTheme()) purple60 else purple50
}

@Composable
fun Color.Companion.accentPink(): Color {
    return if (isSystemInDarkTheme()) pink60 else pink50
}

// Inverse
@Composable
fun Color.Companion.inversePrimary(): Color {
    return if (isSystemInDarkTheme()) blue50 else blue60
}

@Composable
fun Color.Companion.inverseBackground(): Color {
    return if (isSystemInDarkTheme()) common100 else coolNeutral15
}

@Composable
fun Color.Companion.inverseLabel(): Color {
    return if (isSystemInDarkTheme()) coolNeutral10 else coolNeutral99
}

// Fill
@Composable
fun Color.Companion.fillNormal(): Color {
    return if (isSystemInDarkTheme()) coolNeutral50.copy(alpha = 0.22f) else coolNeutral50.copy(alpha = 0.08f)
}

@Composable
fun Color.Companion.fillStrong(): Color {
    return if (isSystemInDarkTheme()) coolNeutral50.copy(alpha = 0.28f) else coolNeutral50.copy(alpha = 0.16f)
}

@Composable
fun Color.Companion.fillAlternative(): Color {
    return if (isSystemInDarkTheme()) coolNeutral50.copy(alpha = 0.12f) else coolNeutral50.copy(alpha = 0.05f)
}

// Material
@Composable
fun Color.Companion.meterialDimmer(): Color {
    return if (isSystemInDarkTheme()) coolNeutral10.copy(alpha = 0.74f) else coolNeutral10.copy(alpha = 0.52f)
}

// Shadow
@Composable
fun Color.Companion.shadowNormal(): Color {
    return if (isSystemInDarkTheme()) staticWhite().copy(alpha = 0.16f) else staticBlack().copy(alpha = 0.16f)
}

@Composable
fun Color.Companion.shadowEmphasize(): Color {
    return if (isSystemInDarkTheme()) staticWhite().copy(alpha = 0.22f) else staticBlack().copy(alpha = 0.22f)
}

@Composable
fun Color.Companion.shadowStrong(): Color {
    return if (isSystemInDarkTheme()) staticWhite().copy(alpha = 0.22f) else staticBlack().copy(alpha = 0.22f)
}

@Composable
fun Color.Companion.shadowHeavy(): Color {
    return if (isSystemInDarkTheme()) staticWhite().copy(alpha = 0.28f) else staticBlack().copy(alpha = 0.28f)
}