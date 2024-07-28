package com.coby.cobylibrary.ui.element.thumbnail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.coby.cobylibrary.R
import com.coby.cobylibrary.ui.theme.*

@Composable
fun ThumbnailView(
    modifier: Modifier = Modifier,
    image: Painter? = null,
    isShadowing: Boolean = false,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(Color.FillNormal())
            .then(if (isShadowing) Modifier.shadow(8.dp, RoundedCornerShape(12.dp)) else Modifier)
            .border(1.dp, Color.LineNormalNeutral(), RoundedCornerShape(12.dp))
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        if (image != null) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        } else {
            ThumbnailEmptyView(
                modifier = modifier,
                onClick = onClick
            )
        }
    }
}

@Composable
@Preview
fun PreviewThumbnailView() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ThumbnailView(
            modifier = Modifier.size(100.dp),
            image = painterResource(id = R.drawable.ic_image),
            isShadowing = true
        ) {}

        ThumbnailView(
            modifier = Modifier.size(200.dp, 150.dp),
            image = painterResource(id = R.drawable.ic_image)
        ) {}

        ThumbnailView(
            modifier = Modifier.size(300.dp, 150.dp),
            image = painterResource(id = R.drawable.ic_image)
        ) {}
    }
}
