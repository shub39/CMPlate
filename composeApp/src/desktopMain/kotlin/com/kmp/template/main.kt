package com.kmp.template

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.kmp.template.di.initKoin

fun main() = application {
    initKoin()

    Window(
        onCloseRequest = ::exitApplication,
        title = "Template",
    ) {
        App()
    }
}