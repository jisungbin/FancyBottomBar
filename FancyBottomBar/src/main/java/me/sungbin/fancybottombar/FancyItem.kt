package me.sungbin.fancybottombar

import androidx.annotation.DrawableRes

/**
 * Created by Ji Sungbin on 2021/04/15.
 */

data class FancyItem(val title: String = "", @DrawableRes val icon: Int? = null, val id: Int = 0)
