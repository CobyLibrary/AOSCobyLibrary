package com.coby.cobylibrary.ui.element.list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.coby.cobylibrary.R
import com.coby.cobylibrary.ui.theme.Typography
import com.coby.cobylibrary.ui.theme.LabelNeutral
import com.coby.cobylibrary.ui.theme.LabelNormal

@Composable
fun CheckBoxListItem(
    isChecked: Boolean,
    title: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val imageRes = if (isChecked) {
            R.drawable.ic_checkbox_on
        } else {
            R.drawable.ic_checkbox_off
        }

        Icon(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            tint = Color.LabelNeutral(),
            modifier = Modifier.size(24.dp)
        )

        Text(
            text = title,
            style = Typography.bodyLarge,
            color = Color.LabelNormal(),
            modifier = Modifier.weight(1f)
        )
    }
}

@Preview
@Composable
fun PreviewCheckBoxListItem() {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val isChecked1 = remember { mutableStateOf(true) }
        val isChecked2 = remember { mutableStateOf(false) }

        CheckBoxListItem(
            isChecked = isChecked1.value,
            title = "동의합니다.",
            onClick = {}
        )
        CheckBoxListItem(
            isChecked = isChecked2.value,
            title = "동의합니다.",
            onClick = {}
        )
    }
}
