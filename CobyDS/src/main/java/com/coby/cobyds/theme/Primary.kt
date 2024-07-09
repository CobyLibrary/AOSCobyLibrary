package com.coby.cobyds.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme

@Composable
fun Color.Companion.blueNormal(): Color {
    return if (isSystemInDarkTheme()) blue60 else blue50
}

@Composable
fun Color.Companion.blueStrong(): Color {
    return if (isSystemInDarkTheme()) blue55 else blue45
}

@Composable
fun Color.Companion.blueHeavy(): Color {
    return if (isSystemInDarkTheme()) blue50 else blue40
}

@Composable
fun Color.Companion.redNormal(): Color {
    return if (isSystemInDarkTheme()) red60 else red50
}

@Composable
fun Color.Companion.redHeavy(): Color {
    return if (isSystemInDarkTheme()) red50 else red40
}

@Composable
fun Color.Companion.greenNormal(): Color {
    return if (isSystemInDarkTheme()) green60 else green50
}

@Composable
fun Color.Companion.greenHeavy(): Color {
    return if (isSystemInDarkTheme()) green50 else green40
}

@Composable
fun Color.Companion.orangeNormal(): Color {
    return if (isSystemInDarkTheme()) orange60 else orange50
}

@Composable
fun Color.Companion.orangeHeavy(): Color {
    return if (isSystemInDarkTheme()) orange50 else orange40
}

@Composable
fun Color.Companion.redOrangeNormal(): Color {
    return if (isSystemInDarkTheme()) redOrange60 else redOrange50
}

@Composable
fun Color.Companion.redOrangeHeavy(): Color {
    return if (isSystemInDarkTheme()) redOrange50 else redOrange40
}

@Composable
fun Color.Companion.limeNormal(): Color {
    return if (isSystemInDarkTheme()) lime60 else lime50
}

@Composable
fun Color.Companion.limeHeavy(): Color {
    return if (isSystemInDarkTheme()) lime50 else lime40
}

@Composable
fun Color.Companion.cyanNormal(): Color {
    return if (isSystemInDarkTheme()) cyan60 else cyan50
}

@Composable
fun Color.Companion.cyanHeavy(): Color {
    return if (isSystemInDarkTheme()) cyan50 else cyan40
}

@Composable
fun Color.Companion.lightBlueNormal(): Color {
    return if (isSystemInDarkTheme()) lightBlue60 else lightBlue50
}

@Composable
fun Color.Companion.lightBlueHeavy(): Color {
    return if (isSystemInDarkTheme()) lightBlue50 else lightBlue40
}

@Composable
fun Color.Companion.violetNormal(): Color {
    return if (isSystemInDarkTheme()) violet60 else violet50
}

@Composable
fun Color.Companion.violetHeavy(): Color {
    return if (isSystemInDarkTheme()) violet50 else violet40
}

@Composable
fun Color.Companion.purpleNormal(): Color {
    return if (isSystemInDarkTheme()) purple60 else purple50
}

@Composable
fun Color.Companion.purpleHeavy(): Color {
    return if (isSystemInDarkTheme()) purple50 else purple40
}

@Composable
fun Color.Companion.pinkNormal(): Color {
    return if (isSystemInDarkTheme()) pink60 else pink50
}

@Composable
fun Color.Companion.pinkHeavy(): Color {
    return if (isSystemInDarkTheme()) pink50 else pink40
}