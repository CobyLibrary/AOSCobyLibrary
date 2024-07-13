package com.coby.cobylibrary.ui.element.thumbnail

import androidx.compose.foundation.background
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.coby.cobylibrary.R
import com.coby.cobylibrary.ui.theme.*

@Composable
fun ThumbnailCardView(
    image: Painter? = null,
    title: String,
    description: String,
    isShadowing: Boolean = false
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1.25f)
            .clip(RoundedCornerShape(12.dp))
            .shadow(
                elevation = if (isShadowing) 8.dp else 0.dp,
                shape = RoundedCornerShape(12.dp),
                clip = false
            )
    ) {
        ThumbnailView(
            modifier = Modifier.fillMaxSize(),
            image = image,
            isShadowing = isShadowing
        )

        Box(
            modifier = Modifier
                .matchParentSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Transparent,
                            Color.Transparent,
                            Color.Transparent,
                            Color.Transparent,
                            Color.StaticBlack().copy(alpha = 0.1f),
                            Color.StaticBlack().copy(alpha = 0.5f),
                            Color.StaticBlack()
                        )
                    )
                )
                .clip(RoundedCornerShape(12.dp))
        )

        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = title,
                style = Typography.titleMedium,
                color = Color.StaticWhite(),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = description,
                style = Typography.labelMedium,
                color = Color.StaticWhite().copy(alpha = 0.5f),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
@Preview
fun PreviewThumbnailCardView() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ThumbnailCardView(
            image = painterResource(id = R.drawable.ic_image),
            title = "전주에서",
            description = "철길입니다철길입니다철길입니다철길입니다철길입니다철길입니다철길입니다철길입니다철길입니다"
        )

        ThumbnailCardView(
            image = painterResource(id = R.drawable.ic_image),
            title = "전주에서",
            description = "철길입니다철길입니다철길입니다철길입니다철길입니다철길입니다철길입니다철길입니다철길입니다"
        )
    }
}
