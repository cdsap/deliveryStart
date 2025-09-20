package com.awesomeapp.notificationlogin

sealed class State117_136 {
    data object Loading : State117_136()
    data class Success(val data: String) : State117_136()
    data class Error(val message: String) : State117_136()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}