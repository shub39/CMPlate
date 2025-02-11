package com.kmp.template.core.presentation

import com.kmp.template.core.domain.DataError
import template.composeapp.generated.resources.Res
import template.composeapp.generated.resources.no_internet
import template.composeapp.generated.resources.no_results
import template.composeapp.generated.resources.server_error
import template.composeapp.generated.resources.too_many_requests
import template.composeapp.generated.resources.unknown

fun DataError.toUiText(): UiText {
    val stringRes = when(this) {
        DataError.Remote.REQUEST_TIMEOUT -> Res.string.too_many_requests
        DataError.Remote.TOO_MANY_REQUESTS -> Res.string.too_many_requests
        DataError.Remote.NO_INTERNET -> Res.string.no_internet
        DataError.Remote.SERVER -> Res.string.server_error
        DataError.Remote.SERIALIZATION -> Res.string.unknown
        DataError.Remote.UNKNOWN -> Res.string.unknown
        DataError.Remote.NO_RESULTS -> Res.string.no_results
    }

    return UiText.StringResourceId(stringRes)
}