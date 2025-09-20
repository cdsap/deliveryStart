package com.awesomeapp.notificationfeed

sealed class State411_16 {
    data object Loading : State411_16()
    data class Success(val data: String) : State411_16()
    data class Error(val message: String) : State411_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}