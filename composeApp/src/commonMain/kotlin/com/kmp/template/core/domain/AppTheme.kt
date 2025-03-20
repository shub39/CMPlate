package com.kmp.template.core.domain

import org.jetbrains.compose.resources.StringResource
import template.composeapp.generated.resources.Res
import template.composeapp.generated.resources.dark
import template.composeapp.generated.resources.light
import template.composeapp.generated.resources.system

enum class AppTheme(val fullName: StringResource) {
    LIGHT(Res.string.light),
    DARK(Res.string.dark),
    SYSTEM(Res.string.system)
}