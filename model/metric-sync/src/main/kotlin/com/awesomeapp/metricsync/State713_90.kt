package com.awesomeapp.metricsync

sealed class State713_90 {
    data object Loading : State713_90()
    data class Success(val data: String) : State713_90()
    data class Error(val message: String) : State713_90()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}