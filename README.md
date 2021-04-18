<img src="FancyBottomBar.gif" width="33%" align="right"/>

# FancyBottomBar
> An awesome fancy bottom-bar library for **jetpack compose**.

-----

### Download? [[Here.]](https://github.com/jisungbin/FancyBottomBar/tree/master/FancyBottomBar/src/main/java/me/sungbin/fancybottombar)

# Todo
- [ ] fancy animation

## Full-example
```kotlin
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        SystemUiController(window).setSystemBarsColor(colors.primary)
        val items = listOf(
            FancyItem("Folders", R.drawable.ic_baseline_folder_24, 0),
            FancyItem(icon = R.drawable.ic_baseline_error_24, id = 1),
            FancyItem(title = "Keys", icon = R.drawable.ic_baseline_key_24, id = 2),
            FancyItem("More?", id = 3)
        )

        val fancyNavigationState = mutableStateOf(0)

        setContent {
            BindView {
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
                        FancyBottomBar(
                            fancyColors = FancyColors(primary = colors.primary),
                            fancyOptions = FancyOptions(fontFamily = defaultFontFamily),
                            items = items
                        ) {
                            fancyNavigationState.value = id
                        }
                    }
                }
            }
        }
    }

    @Composable
    private fun BindFancyPage(index: Int) {
        Column(
            modifier = Modifier.fillMaxSize().padding(bottom = 80.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "\uD83C\uDF1F Awesome FancyBottomBar \uD83C\uDF1F\nPage index: $index",
                fontSize = 20.sp,
                fontFamily = defaultFontFamily,
                textAlign = TextAlign.Center
            )
        }
    }
}
```
