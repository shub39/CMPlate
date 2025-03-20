package com.kmp.template.core.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.kmp.template.core.domain.AppTheme
import com.kmp.template.core.domain.Theme
import com.materialkolor.DynamicMaterialTheme

@Composable
fun AppTheme(
    theme: Theme = Theme(),
    content: @Composable () -> Unit
) {
    DynamicMaterialTheme(
        seedColor = theme.seedColor,
        withAmoled = theme.withAmoled,
        useDarkTheme = when (theme.appTheme) {
            AppTheme.LIGHT -> false
            AppTheme.DARK -> true
            AppTheme.SYSTEM -> isSystemInDarkTheme()
        },
        typography = provideTypography(
            font = theme.font.fontResource
        ),
        style = theme.style,
        content = content
    )
}