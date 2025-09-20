package com.awesomeapp.reportpost

sealed class State514_48 {
    data object Loading : State514_48()
    data class Success(val data: String) : State514_48()
    data class Error(val message: String) : State514_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}