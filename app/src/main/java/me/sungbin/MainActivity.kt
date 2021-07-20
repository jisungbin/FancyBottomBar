package me.sungbin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.sungbin.fancybottombar.FancyBottomBar
import me.sungbin.fancybottombar.FancyItem

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val items = listOf(
            FancyItem("Folders", R.drawable.ic_baseline_folder_24, 0),
            FancyItem(icon = R.drawable.ic_baseline_error_24, id = 1),
            FancyItem(title = "Keys", icon = R.drawable.ic_baseline_vpn_key_24, id = 2),
            FancyItem("More?", id = 3)
        )

        val fancyNavigationState = mutableStateOf(0)

        setContent {
            Box(modifier = Modifier.fillMaxSize()) {
                Crossfade(
                    fancyNavigationState.value,
                    modifier = Modifier.fillMaxSize()
                ) { index ->
                    BindFancyPage(index = index)
                }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    FancyBottomBar(items = items) {
                        fancyNavigationState.value = id
                    }
                }
            }
        }
    }

    @Composable
    private fun BindFancyPage(index: Int) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 80.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "\uD83C\uDF1F Awesome FancyBottomBar \uD83C\uDF1F\nPage index: $index",
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}
