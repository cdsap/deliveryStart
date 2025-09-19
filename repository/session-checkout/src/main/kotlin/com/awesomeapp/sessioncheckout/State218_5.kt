package com.awesomeapp.sessioncheckout

sealed class State218_5 {
    data object Loading : State218_5()
    data class Success(val data: String) : State218_5()
    data class Error(val message: String) : State218_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}