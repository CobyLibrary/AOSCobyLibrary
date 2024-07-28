package com.coby.cobylibrary.ui.element.thumbnail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coby.cobylibrary.R
import com.coby.cobylibrary.ui.theme.*

@Composable
fun ThumbnailTitleView(
    image: Painter? = null,
    title: String,
    description: String? = null,
    isShadowing: Boolean = false,
    onClick: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
    ) {
        ThumbnailView(
            modifier = Modifier
                .aspectRatio(1.0f),
            image = image,
            isShadowing = isShadowing
        )

        Column(
            verticalArrangement = Arrangement.spacedBy(2.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = title,
                style = Typography.titleSmall,
                color = Color.LabelNormal(),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            if (description != null) {
                Text(
                    text = title,
                    style = Typography.bodySmall,
                    color = Color.LabelAlternative(),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
@Preview
fun PreviewThumbnailTitleView() {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        ThumbnailTitleView(
            image = painterResource(id = R.drawable.ic_image),
            title = "제목입니다만",
            description = "사진에 대한 설명이에요"
        ) {}

        ThumbnailTitleView(
            title = "제목입니다만"
        ) {}
    }
}