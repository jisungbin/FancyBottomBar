/*
* FancyBottomBar created by Ji Sungbin
* FancyBottomBar license is under the MIT license.
* Please see: https://github.com/jisungbin/FancyBottomBar/blob/master/LICENSE
*/

package me.sungbin.fancybottombar

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

interface FancyOptions {
    val fontFamily: FontFamily
    val indicatorHeight: Dp
    val barHeight: Dp
    val titleTopPadding: Dp
}

private class FancyOptionsImpl(
    override val fontFamily: FontFamily,
    override val indicatorHeight: Dp,
    override val barHeight: Dp,
    override val titleTopPadding: Dp
) : FancyOptions

fun FancyOptions(
    fontFamily: FontFamily = FontFamily.Default,
    indicatorHeight: Dp = 1.dp,
    barHeight: Dp = 60.dp,
    titleTopPadding: Dp = 4.dp
): FancyOptions = FancyOptionsImpl(fontFamily, indicatorHeight, barHeight, titleTopPadding)
