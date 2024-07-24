package com.coby.cobylibrary.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme

@Composable
fun Color.Companion.StaticWhite(): Color {
    return if (isSystemInDarkTheme()) Common100 else Common100
}

@Composable
fun Color.Companion.StaticBlack(): Color {
    return if (isSystemInDarkTheme()) Common0 else Common0
}

// Label
@Composable
fun Color.Companion.LabelNormal(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral99 else CoolNeutral10
}

@Composable
fun Color.Companion.LabelStrong(): Color {
    return if (isSystemInDarkTheme()) Common100 else Common0
}

@Composable
fun Color.Companion.LabelNeutral(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral90.copy(alpha = 0.88f) else CoolNeutral22.copy(alpha = 0.88f)
}

@Composable
fun Color.Companion.LabelAlternative(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral80.copy(alpha = 0.61f) else CoolNeutral25.copy(alpha = 0.61f)
}

@Composable
fun Color.Companion.LabelAssistive(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral80.copy(alpha = 0.28f) else CoolNeutral25.copy(alpha = 0.28f)
}

@Composable
fun Color.Companion.LabelDisable(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral70.copy(alpha = 0.16f) else CoolNeutral25.copy(alpha = 0.16f)
}

// Background
@Composable
fun Color.Companion.BackgroundNormalNormal(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral15 else Common100
}

@Composable
fun Color.Companion.BackgroundNormalAlternative(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral5 else CoolNeutral99
}

@Composable
fun Color.Companion.BackgroundElevatedNormal(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral17 else Common100
}

@Composable
fun Color.Companion.BackgroundElevatedAlternative(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral7 else CoolNeutral99
}

// Interaction
@Composable
fun Color.Companion.InteractionInactive(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral40 else CoolNeutral70
}

@Composable
fun Color.Companion.InteractionDisable(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral22 else CoolNeutral98
}

// Line
@Composable
fun Color.Companion.LineNormalNormal(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral50.copy(alpha = 0.32f) else CoolNeutral50.copy(alpha = 0.22f)
}

@Composable
fun Color.Companion.LineNormalNeutral(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral50.copy(alpha = 0.28f) else CoolNeutral50.copy(alpha = 0.16f)
}

@Composable
fun Color.Companion.LineNormalAlternative(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral50.copy(alpha = 0.22f) else CoolNeutral50.copy(alpha = 0.08f)
}

@Composable
fun Color.Companion.LineSolidNormal(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral25 else CoolNeutral96
}

@Composable
fun Color.Companion.LineSolidNeutral(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral23 else CoolNeutral97
}

@Composable
fun Color.Companion.LineSolidAlternative(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral22 else CoolNeutral98
}

// Status
@Composable
fun Color.Companion.StatusPositive(): Color {
    return if (isSystemInDarkTheme()) Green60 else Green50
}

@Composable
fun Color.Companion.StatusCautionary(): Color {
    return if (isSystemInDarkTheme()) Orange60 else Orange50
}

@Composable
fun Color.Companion.StatusNegative(): Color {
    return if (isSystemInDarkTheme()) Red60 else Red50
}

// Accent
@Composable
fun Color.Companion.AccentLime(): Color {
    return if (isSystemInDarkTheme()) Lime60 else Lime50
}

@Composable
fun Color.Companion.AccentCyan(): Color {
    return if (isSystemInDarkTheme()) Cyan60 else Cyan50
}

@Composable
fun Color.Companion.AccentLightBlue(): Color {
    return if (isSystemInDarkTheme()) LightBlue60 else LightBlue50
}

@Composable
fun Color.Companion.AccentViolet(): Color {
    return if (isSystemInDarkTheme()) Violet60 else Violet50
}

@Composable
fun Color.Companion.AccentPurple(): Color {
    return if (isSystemInDarkTheme()) Purple60 else Purple50
}

@Composable
fun Color.Companion.AccentPink(): Color {
    return if (isSystemInDarkTheme()) Pink60 else Pink50
}

// Inverse
@Composable
fun Color.Companion.InversePrimary(): Color {
    return if (isSystemInDarkTheme()) Blue50 else Blue60
}

@Composable
fun Color.Companion.InverseBackground(): Color {
    return if (isSystemInDarkTheme()) Common100 else CoolNeutral15
}

@Composable
fun Color.Companion.InverseLabel(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral10 else CoolNeutral99
}

// Fill
@Composable
fun Color.Companion.FillNormal(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral50.copy(alpha = 0.22f) else CoolNeutral50.copy(alpha = 0.08f)
}

@Composable
fun Color.Companion.FillStrong(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral50.copy(alpha = 0.28f) else CoolNeutral50.copy(alpha = 0.16f)
}

@Composable
fun Color.Companion.FillAlternative(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral50.copy(alpha = 0.12f) else CoolNeutral50.copy(alpha = 0.05f)
}

// Material
@Composable
fun Color.Companion.MeterialDimmer(): Color {
    return if (isSystemInDarkTheme()) CoolNeutral10.copy(alpha = 0.74f) else CoolNeutral10.copy(alpha = 0.52f)
}

// Shadow
@Composable
fun Color.Companion.ShadowNormal(): Color {
    return if (isSystemInDarkTheme()) StaticWhite().copy(alpha = 0.16f) else StaticBlack().copy(alpha = 0.16f)
}

@Composable
fun Color.Companion.ShadowEmphasize(): Color {
    return if (isSystemInDarkTheme()) StaticWhite().copy(alpha = 0.22f) else StaticBlack().copy(alpha = 0.22f)
}

@Composable
fun Color.Companion.ShadowStrong(): Color {
    return if (isSystemInDarkTheme()) StaticWhite().copy(alpha = 0.22f) else StaticBlack().copy(alpha = 0.22f)
}

@Composable
fun Color.Companion.ShadowHeavy(): Color {
    return if (isSystemInDarkTheme()) StaticWhite().copy(alpha = 0.28f) else StaticBlack().copy(alpha = 0.28f)
}
