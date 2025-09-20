package com.awesomeapp.metricsearch

sealed class State566_66 {
    data object Loading : State566_66()
    data class Success(val data: String) : State566_66()
    data class Error(val message: String) : State566_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}