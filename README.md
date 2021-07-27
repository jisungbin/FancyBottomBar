<img src="FancyBottomBar.gif" width="33%" align="right"/>

# FancyBottomBar

An awesome fancy bottom-bar library for Jetpack Compose.

-----

# Download [![](https://img.shields.io/maven-central/v/io.github.jisungbin/fancybottombar)](https://search.maven.org/artifact/io.github.jisungbin/fancybottombar)

```groovy
implementation "io.github.jisungbin:fancybottombar:${version}"
```

# Usage

### 1. Create page state variable

```kotlin
val fancyNavigationState = remember { mutableStateOf(0) }
```



### 2. Create `FancyBottomBar` Items

```kotlin
val items = listOf(
FancyItem("Folders", R.drawable.ic_baseline_folder_24, 0),
	FancyItem(icon = R.drawable.ic_baseline_error_24, id = 1),
	FancyItem(title = "Keys", icon = R.drawable.ic_baseline_vpn_key_24, id = 2),
 	FancyItem("More?", id = 3)
)
```

#### FancyItem

```kotlin
class FancyItem(
  val title: String = "",
  @DrawableRes val icon: Int? = null, 
  val id: Int = 0
)
```



### 3. Setup `FancyBottomBar`

```kotlin
setContent {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 80.dp) // 80dp: FancyBottomBar default height(60.dp) + bottom margin(20.dp)
    ) {
        Crossfade(
    	    targetState = fancyNavigationState.value,
            modifier = Modifier.fillMaxSize()
        ) { index ->
            Text(text = "\uD83C\uDF1F Awesome FancyBottomBar \uD83C\uDF1F\nPage index: $index")
        }
        Column(
    	    modifier = Modifer.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            FancyBottomBar(
                modifier = Modifier,
    		    fancyColors = FancyColors(),
    		    fancyOptions = FancyOptions(),
                items = items
            ) {
                fancyNavigationState.value = id
            }
        }
    }
}
```

#### FancyColor

```kotlin
class FancyColors(
    val background: Color = Color.White,
    val indicatorBackground: Color = Color.LightGray,
    val primary: Color = Color.Blue
)
```

#### FancyOptions

```kotlin
class FancyOptions(
    val fontFamily: FontFamily = FontFamily.Default,
    val indicatorHeight: Dp = 1.dp,
    val barHeight: Dp = 60.dp,
    val titleTopPadding: Dp = 4.dp
)
```




---

# 🤗 Happy Coding :)

