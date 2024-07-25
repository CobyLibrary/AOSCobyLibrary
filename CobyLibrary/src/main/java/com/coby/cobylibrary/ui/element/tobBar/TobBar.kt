package com.coby.cobylibrary.ui.element.basic

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coby.cobylibrary.R
import com.coby.cobylibrary.ui.theme.*

@Composable
fun TopBarView(
    barType: BarType = BarType.Filled,
    leftSide: ContentType = ContentType.Left,
    leftTitle: String = "",
    leftIcon: Int? = null,
    leftAction: () -> Unit = {},
    title: String = "",
    rightSide: ContentType = ContentType.None,
    rightTitle: String = "",
    rightIcon: Int? = null,
    rightAction: () -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(
                when (barType) {
                    BarType.TransParents -> Color.Transparent
                    else -> Color.BackgroundNormalNormal()
                }
            )
            .statusBarsPadding(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            BarContentView(
                contentType = leftSide,
                title = leftTitle,
                icon = leftIcon,
                action = leftAction,
                barType = barType
            )
            Spacer(modifier = Modifier.weight(1f))
        }

        Text(
            text = title,
            style = Typography.titleMedium,
            color = Color.LabelNormal()
        )

        Row(
            modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Spacer(modifier = Modifier.weight(1f))
            BarContentView(
                contentType = rightSide,
                title = rightTitle,
                icon = rightIcon,
                action = rightAction,
                barType = barType
            )
        }
    }

    if (barType == BarType.Underlined) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(MaterialTheme.colorScheme.onSurface.copy(alpha = 0.2f))
        )
    }
}

@Composable
fun BarContentView(
    contentType: ContentType,
    title: String = "",
    icon: Int? = null,
    action: () -> Unit = {},
    barType: BarType
) {
    when (contentType) {
        ContentType.None -> {
            Spacer(modifier = Modifier.size(40.dp))
        }
        ContentType.Title -> {
            Text(
                text = title,
                style = Typography.titleLarge,
                color = Color.LabelNormal(),
                modifier = Modifier
                    .padding(horizontal = BaseSize.horizontalPadding)
                    .clickable { action() }
            )
        }
        ContentType.Text -> {
            Text(
                text = title,
                style = Typography.titleSmall,
                color = Color.LabelNormal(),
                modifier = Modifier
                    .padding(horizontal = BaseSize.horizontalPadding)
                    .clickable { action() }
            )
        }
        ContentType.Left -> {
            icon?.let {
                Icon(
                    painter = painterResource(id = it),
                    contentDescription = null,
                    tint = Color.LabelNormal(),
                    modifier = Modifier
                        .size(24.dp)
                        .padding(horizontal = BaseSize.horizontalPadding - 4.dp)
                        .clickable { action() }
                )
            } ?: Spacer(modifier = Modifier.size(40.dp))
        }
        ContentType.Icon -> {
            icon?.let {
                Icon(
                    painter = painterResource(id = it),
                    contentDescription = null,
                    tint = Color.LabelNormal(),
                    modifier = Modifier
                        .padding(horizontal = BaseSize.horizontalPadding - 4.dp)
                        .size(24.dp)
                        .clickable { action() }
                )
            } ?: Spacer(modifier = Modifier.size(40.dp))
        }
        ContentType.IconInverse -> {
            icon?.let {
                Icon(
                    painter = painterResource(id = it),
                    contentDescription = null,
                    tint = Color.InverseLabel(),
                    modifier = Modifier
                        .padding(horizontal = BaseSize.horizontalPadding - 8.dp)
                        .background(
                            Color.InverseBackground().copy(alpha = 0.7f),
                            CircleShape
                        )
                        .padding(4.dp)
                        .size(24.dp)
                        .clickable { action() }
                )
            } ?: Spacer(modifier = Modifier.size(40.dp))
        }
    }
}

enum class ContentType {
    None, Title, Text, Left, Icon, IconInverse
}

enum class BarType {
    Filled, Underlined, TransParents
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    Column {
        TopBarView(
            barType = BarType.Underlined,
            leftSide = ContentType.Text,
            leftTitle = "확인",
            title = "제목"
        )

        TopBarView(
            barType = BarType.TransParents,
            leftSide = ContentType.IconInverse,
            leftIcon = R.drawable.ic_back,
            rightSide = ContentType.IconInverse,
            rightIcon = R.drawable.ic_close,
            rightAction = { }
        )

        TopBarView(
            barType = BarType.TransParents,
            leftSide = ContentType.IconInverse,
            leftIcon = R.drawable.ic_close,
            rightSide = ContentType.Icon,
            rightIcon = R.drawable.ic_close,
            rightAction = { }
        )

        TopBarView(
            barType = BarType.Underlined,
            leftSide = ContentType.Title,
            leftTitle = "확인",
            title = "제목",
            rightSide = ContentType.Icon,
            rightIcon = R.drawable.ic_forward,
            rightAction = { }
        )

        TopBarView(
            barType = BarType.Underlined,
            leftSide = ContentType.Text,
            leftTitle = "확인",
            title = "제목",
            rightSide = ContentType.Text,
            rightTitle = "확인",
            rightAction = { }
        )
    }
}