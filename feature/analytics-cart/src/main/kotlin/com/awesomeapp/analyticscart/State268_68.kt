package com.awesomeapp.analyticscart

sealed class State268_68 {
    data object Loading : State268_68()
    data class Success(val data: String) : State268_68()
    data class Error(val message: String) : State268_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}