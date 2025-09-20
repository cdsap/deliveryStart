package com.awesomeapp.metricsearch

sealed class State566_84 {
    data object Loading : State566_84()
    data class Success(val data: String) : State566_84()
    data class Error(val message: String) : State566_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}