package com.coby.cobylibrary.ui.element.basic

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.coby.cobylibrary.ui.theme.lineNormalAlternative
import com.coby.cobylibrary.ui.theme.lineNormalNormal

@Composable
fun CBDivider(
    isThick: Boolean = false,
    vertical: Boolean = false
) {
    val color: Color = if (!isThick) Color.lineNormalNormal() else Color.lineNormalAlternative()
    val height: Dp = if (!isThick) 1.dp else 12.dp

    if (vertical) {
        Box(
            modifier = Modifier
                .width(1.dp)
                .fillMaxHeight()
                .background(color)
        )
    } else {
        Box(
            modifier = Modifier
                .height(height)
                .fillMaxWidth()
                .background(color)
        )
    }
}

@Preview
@Composable
fun PreviewCBDivider() {
    Column {
        CBDivider()
        Spacer(modifier = Modifier.height(16.dp))
        CBDivider(isThick = true)
        Spacer(modifier = Modifier.height(16.dp))
        CBDivider()
        Spacer(modifier = Modifier.height(16.dp))
        CBDivider(isThick = true)
        Spacer(modifier = Modifier.height(16.dp))
    }
}
