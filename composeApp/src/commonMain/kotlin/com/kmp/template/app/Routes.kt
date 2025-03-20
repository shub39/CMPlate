package com.kmp.template.app

import kotlinx.serialization.Serializable

sealed interface Routes {
    @Serializable
    data object Home: Routes

    @Serializable
    data object Settings: Routes
}