package com.coby.cobylibrary.ui.element.thumbnail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun ThumbnailTileView(
    isSelected: Boolean = false,
    image: Painter? = null,
    title: String,
    subTitle: String? = null,
    description: String,
    isSelectedBorderColor: Color = Color.BlueNormal()
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.BackgroundNormalNormal())
            .clip(RoundedCornerShape(12.dp))
            .border(
                width = 1.dp,
                color = if (isSelected) isSelectedBorderColor else Color.LineNormalNeutral(),
                shape = RoundedCornerShape(12.dp)
            )
            .padding(12.dp)
    ) {
        ThumbnailView(
            modifier = Modifier.size(64.dp),
            image = image
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .weight(1f)
                .padding(end = 4.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = title,
                    style = Typography.titleSmall,
                    color = Color.LabelNormal(),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                if (subTitle != null) {
                    Text(
                        text = subTitle,
                        style = Typography.bodySmall,
                        fontWeight = FontWeight.Normal,
                        color = Color.LabelAlternative(),
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
            }

            Text(
                text = description,
                style = Typography.bodyMedium,
                fontWeight = FontWeight.Normal,
                color = Color.LabelNeutral(),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview
@Composable
fun PreviewThumbnailTileView() {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        ThumbnailTileView(
            isSelected = true,
            image = painterResource(id = R.drawable.ic_image),
            title = "title",
            subTitle = "22.12.12",
            description = "description"
        )

        ThumbnailTileView(
            isSelected = false,
            image = null,
            title = "title",
            subTitle = "date",
            description = "description"
        )
    }
}