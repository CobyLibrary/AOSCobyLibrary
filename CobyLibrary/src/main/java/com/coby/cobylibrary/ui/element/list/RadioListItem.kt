package com.coby.cobylibrary.ui.element.list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
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
fun RadioListItem(
    isChecked: Boolean,
    title: String,
    action: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = action),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            style = Typography.bodyLarge,
            color = Color.LabelNormal(),
            modifier = Modifier.weight(1f)
        )

        val imageRes = if (isChecked) {
            R.drawable.ic_radio_on
        } else {
            R.drawable.ic_radio_off
        }

        Icon(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            tint = Color.LabelNeutral(),
            modifier = Modifier.size(24.dp)
        )
    }
}

@Preview
@Composable
fun PreviewRadioListItem() {
    Column(
        modifier = Modifier.padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        RadioListItem(isChecked = true, title = "체크") {
            println("클릭")
        }

        RadioListItem(isChecked = false, title = "체크") {
            println("클릭")
        }
    }
}
