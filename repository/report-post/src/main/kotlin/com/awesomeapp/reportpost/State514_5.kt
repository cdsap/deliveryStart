package com.awesomeapp.reportpost

sealed class State514_5 {
    data object Loading : State514_5()
    data class Success(val data: String) : State514_5()
    data class Error(val message: String) : State514_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}