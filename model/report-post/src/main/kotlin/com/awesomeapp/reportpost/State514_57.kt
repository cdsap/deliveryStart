package com.awesomeapp.reportpost

sealed class State514_57 {
    data object Loading : State514_57()
    data class Success(val data: String) : State514_57()
    data class Error(val message: String) : State514_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}