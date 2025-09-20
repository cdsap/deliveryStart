package com.awesomeapp.metricsearch

sealed class State566_12 {
    data object Loading : State566_12()
    data class Success(val data: String) : State566_12()
    data class Error(val message: String) : State566_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}