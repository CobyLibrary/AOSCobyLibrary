package com.coby.cobylibrary.ui.element.thumbnail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.coby.cobylibrary.R
import com.coby.cobylibrary.ui.theme.*

@Composable
fun ThumbnailEmptyView(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.FillStrong())
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_image),
            contentDescription = null,
            modifier = Modifier.size(64.dp),
            tint = Color.LabelAlternative()
        )
    }
}

@Composable
@Preview
fun PreviewThumbnailEmptyView() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ThumbnailEmptyView(modifier = Modifier.size(100.dp))

        ThumbnailEmptyView(modifier = Modifier.size(150.dp))

        ThumbnailEmptyView(
            modifier = Modifier
                .width(300.dp)
                .height(150.dp)
        )
    }
}