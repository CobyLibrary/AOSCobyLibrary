package com.coby.cobylibrary.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme

@Composable
fun Color.Companion.BlueNormal(): Color {
    return if (isSystemInDarkTheme()) Blue60 else Blue50
}

@Composable
fun Color.Companion.BlueStrong(): Color {
    return if (isSystemInDarkTheme()) Blue55 else Blue45
}

@Composable
fun Color.Companion.BlueHeavy(): Color {
    return if (isSystemInDarkTheme()) Blue50 else Blue40
}

@Composable
fun Color.Companion.RedNormal(): Color {
    return if (isSystemInDarkTheme()) Red60 else Red50
}

@Composable
fun Color.Companion.RedHeavy(): Color {
    return if (isSystemInDarkTheme()) Red50 else Red40
}

@Composable
fun Color.Companion.GreenNormal(): Color {
    return if (isSystemInDarkTheme()) Green60 else Green50
}

@Composable
fun Color.Companion.GreenHeavy(): Color {
    return if (isSystemInDarkTheme()) Green50 else Green40
}

@Composable
fun Color.Companion.OrangeNormal(): Color {
    return if (isSystemInDarkTheme()) Orange60 else Orange50
}

@Composable
fun Color.Companion.OrangeHeavy(): Color {
    return if (isSystemInDarkTheme()) Orange50 else Orange40
}

@Composable
fun Color.Companion.RedOrangeNormal(): Color {
    return if (isSystemInDarkTheme()) RedOrange60 else RedOrange50
}

@Composable
fun Color.Companion.RedOrangeHeavy(): Color {
    return if (isSystemInDarkTheme()) RedOrange50 else RedOrange40
}

@Composable
fun Color.Companion.LimeNormal(): Color {
    return if (isSystemInDarkTheme()) Lime60 else Lime50
}

@Composable
fun Color.Companion.LimeHeavy(): Color {
    return if (isSystemInDarkTheme()) Lime50 else Lime40
}

@Composable
fun Color.Companion.CyanNormal(): Color {
    return if (isSystemInDarkTheme()) Cyan60 else Cyan50
}

@Composable
fun Color.Companion.CyanHeavy(): Color {
    return if (isSystemInDarkTheme()) Cyan50 else Cyan40
}

@Composable
fun Color.Companion.LightBlueNormal(): Color {
    return if (isSystemInDarkTheme()) LightBlue60 else LightBlue50
}

@Composable
fun Color.Companion.LightBlueHeavy(): Color {
    return if (isSystemInDarkTheme()) LightBlue50 else LightBlue40
}

@Composable
fun Color.Companion.VioletNormal(): Color {
    return if (isSystemInDarkTheme()) Violet60 else Violet50
}

@Composable
fun Color.Companion.VioletHeavy(): Color {
    return if (isSystemInDarkTheme()) Violet50 else Violet40
}

@Composable
fun Color.Companion.PurpleNormal(): Color {
    return if (isSystemInDarkTheme()) Purple60 else Purple50
}

@Composable
fun Color.Companion.PurpleHeavy(): Color {
    return if (isSystemInDarkTheme()) Purple50 else Purple40
}

@Composable
fun Color.Companion.PinkNormal(): Color {
    return if (isSystemInDarkTheme()) Pink60 else Pink50
}

@Composable
fun Color.Companion.PinkHeavy(): Color {
    return if (isSystemInDarkTheme()) Pink50 else Pink40
}
