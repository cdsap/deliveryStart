package com.awesomeapp.metricnetwork

sealed class State664_17 {
    data object Loading : State664_17()
    data class Success(val data: String) : State664_17()
    data class Error(val message: String) : State664_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}