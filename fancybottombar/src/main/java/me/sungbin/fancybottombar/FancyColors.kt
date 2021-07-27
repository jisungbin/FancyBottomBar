/*
* FancyBottomBar created by Ji Sungbin
* FancyBottomBar license is under the MIT license.
* Please see: https://github.com/jisungbin/FancyBottomBar/blob/master/LICENSE
*/

package me.sungbin.fancybottombar

import androidx.compose.ui.graphics.Color

interface FancyColors {
    val background: Color
    val indicatorBackground: Color
    val primary: Color
}

private class FancyColorImpl(
    override val background: Color,
    override val indicatorBackground: Color,
    override val primary: Color
) : FancyColors

fun FancyColors(
    background: Color = Color.White,
    indicatorBackground: Color = Color.LightGray,
    primary: Color = Color.Blue
): FancyColors = FancyColorImpl(background, indicatorBackground, primary)
