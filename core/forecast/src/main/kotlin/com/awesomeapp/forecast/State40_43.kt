package com.awesomeapp.forecast

sealed class State40_43 {
    data object Loading : State40_43()
    data class Success(val data: String) : State40_43()
    data class Error(val message: String) : State40_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}