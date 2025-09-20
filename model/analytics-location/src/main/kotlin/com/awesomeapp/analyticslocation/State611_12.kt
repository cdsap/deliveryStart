package com.awesomeapp.analyticslocation

sealed class State611_12 {
    data object Loading : State611_12()
    data class Success(val data: String) : State611_12()
    data class Error(val message: String) : State611_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}