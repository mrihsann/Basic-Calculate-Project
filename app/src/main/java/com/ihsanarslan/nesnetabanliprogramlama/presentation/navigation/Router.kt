package com.ihsanarslan.nesnetabanliprogramlama.presentation.navigation

import kotlinx.serialization.Serializable

sealed class Router {

    @Serializable
    object Calculate

    @Serializable
    data class Result(val result: Float)

}