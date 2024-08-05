package com.coby.cobylibrary.ui.element.basic

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import com.coby.cobylibrary.ui.theme.BackgroundNormalNormal
import com.coby.cobylibrary.ui.theme.FillStrong
import com.coby.cobylibrary.ui.theme.LabelNeutral
import com.coby.cobylibrary.ui.theme.LineNormalNeutral

@Composable
fun TagView(
    isSelected: Boolean = false,
    title: String,
    tagColor: Color = Color.FillStrong(),
    labelColor: Color = Color.LabelNeutral(),
    onClick: () -> Unit
) {
    val backgroundColor = if (isSelected) tagColor else Color.BackgroundNormalNormal()

    Text(
        text = title,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = labelColor,
        modifier = Modifier
            .background(color = backgroundColor, shape = RoundedCornerShape(8.dp))
            .border(width = 1.dp, color = Color.LineNormalNeutral(), shape = RoundedCornerShape(8.dp))
            .padding(horizontal = 12.dp, vertical = 8.dp)
            .clickable { onClick() }
    )
}

@Preview
@Composable
fun PreviewTagView() {
    TagView(
        isSelected = true,
        title = "태그",
        onClick = {}
    )
}
