package com.awesomeapp.notificationlogin

sealed class State117_85 {
    data object Loading : State117_85()
    data class Success(val data: String) : State117_85()
    data class Error(val message: String) : State117_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}