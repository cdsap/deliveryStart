package com.awesomeapp.reportpost

sealed class State514_87 {
    data object Loading : State514_87()
    data class Success(val data: String) : State514_87()
    data class Error(val message: String) : State514_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}