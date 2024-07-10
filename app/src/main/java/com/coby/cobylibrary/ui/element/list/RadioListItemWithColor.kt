package com.coby.cobylibrary.ui.element.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.coby.cobylibrary.R
import com.coby.cobylibrary.ui.theme.*

@Composable
fun RadioListItemWithColor(
    isChecked: Boolean,
    color: Color,
    title: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(color)
            )

            Text(
                text = title,
                style = Typography.bodyLarge,
                color = Color.LabelNormal(),
                modifier = Modifier.weight(1f)
            )
        }

        Icon(
            painter = painterResource(id = if (isChecked) R.drawable.ic_radio_on else R.drawable.ic_radio_off),
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = Color.LabelNeutral()
        )
    }
}

@Composable
@Preview
fun PreviewRadioListItemWithColor() {
    Column(
        modifier = Modifier.padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        RadioListItemWithColor(
            isChecked = true,
            color = Color.Red40,
            title = "제목"
        )

        RadioListItemWithColor(
            isChecked = false,
            color = Color.Blue40,
            title = "제목"
        )
    }
}
