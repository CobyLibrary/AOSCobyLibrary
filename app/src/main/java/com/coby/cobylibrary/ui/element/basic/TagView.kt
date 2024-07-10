package com.coby.cobylibrary.ui.element.basic

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coby.cobylibrary.ui.theme.backgroundNormalNormal
import com.coby.cobylibrary.ui.theme.fillStrong
import com.coby.cobylibrary.ui.theme.labelNeutral
import com.coby.cobylibrary.ui.theme.lineNormalNeutral

@Composable
fun TagView(
    isSelected: Boolean = false,
    title: String,
    tagColor: Color = Color.fillStrong(),
    labelColor: Color = Color.labelNeutral()
) {
    val backgroundColor = if (isSelected) tagColor else Color.backgroundNormalNormal()

    Text(
        text = title,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = labelColor,
        modifier = Modifier
            .padding(horizontal = 12.dp, vertical = 8.dp)
            .background(color = backgroundColor, shape = RoundedCornerShape(8.dp))
            .border(width = 1.dp, color = Color.lineNormalNeutral(), shape = RoundedCornerShape(8.dp))
    )
}

@Preview
@Composable
fun PreviewTagView() {
    TagView(isSelected = true, title = "태그")
}
