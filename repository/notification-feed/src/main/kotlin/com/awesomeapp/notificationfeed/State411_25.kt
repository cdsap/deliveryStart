package com.awesomeapp.notificationfeed

sealed class State411_25 {
    data object Loading : State411_25()
    data class Success(val data: String) : State411_25()
    data class Error(val message: String) : State411_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}