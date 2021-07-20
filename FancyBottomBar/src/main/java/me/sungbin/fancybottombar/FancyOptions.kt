/*
* FancyBottomBar created by Ji Sungbin
* FancyBottomBar license is under the MIT license.
* Please see: https://github.com/jisungbin/FancyBottomBar/blob/master/LICENSE
*/

package me.sungbin.fancybottombar

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class FancyOptions(
    val fontFamily: FontFamily = FontFamily.Default,
    val indicatorHeight: Dp = 1.dp,
    val barHeight: Dp = 60.dp,
    val titleTopPadding: Dp = 4.dp
)
