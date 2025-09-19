package com.awesomeapp.notificationcart

sealed class State264_15 {
    data object Loading : State264_15()
    data class Success(val data: String) : State264_15()
    data class Error(val message: String) : State264_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}