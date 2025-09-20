package com.awesomeapp.reportpost

sealed class State514_84 {
    data object Loading : State514_84()
    data class Success(val data: String) : State514_84()
    data class Error(val message: String) : State514_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}