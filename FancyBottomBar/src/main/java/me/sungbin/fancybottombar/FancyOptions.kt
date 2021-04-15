package me.sungbin.fancybottombar

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Created by Ji Sungbin on 2021/04/15.
 */

class FancyOptions(
    var fontFamily: FontFamily = FontFamily.Default,
    var indicatorHeight: Dp = 1.dp,
    var barHeight: Dp = 60.dp,
    var titleTopPadding: Dp = 4.dp
)
