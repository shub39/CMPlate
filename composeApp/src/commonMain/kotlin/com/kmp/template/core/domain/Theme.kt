package com.kmp.template.core.domain

import androidx.compose.ui.graphics.Color
import com.materialkolor.PaletteStyle

data class Theme(
    val seedColor: Color = Color.White,
    val appTheme: AppTheme = AppTheme.SYSTEM,
    val withAmoled: Boolean = false,
    val style: PaletteStyle = PaletteStyle.TonalSpot,
    val materialTheme: Boolean = false,
    val font: Fonts = Fonts.POPPINS
)
