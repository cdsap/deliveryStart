package com.awesomeapp.analyticscart

sealed class State268_17 {
    data object Loading : State268_17()
    data class Success(val data: String) : State268_17()
    data class Error(val message: String) : State268_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}