package com.coby.cobylibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.coby.cobylibrary.ui.element.basic.BarType
import com.coby.cobylibrary.ui.element.basic.ContentType
import com.coby.cobylibrary.ui.element.basic.TopBarView
import com.coby.cobylibrary.ui.theme.CoolNeutral90
import com.coby.cobylibrary.ui.theme.Cyan95

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TopBarPreview()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    Column {
        TopBarView()

        TopBarView(
            leftSide = ContentType.Icon,
            leftIcon = R.drawable.ic_forward,
        )

        TopBarView(
            barType = BarType.TransParents,
            leftSide = ContentType.Title,
            leftTitle = "확인",
            title = "제목",
            rightSide = ContentType.Icon,
            rightIcon = R.drawable.ic_forward,
            rightAction = { }
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