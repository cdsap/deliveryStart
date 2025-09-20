package com.awesomeapp.notificationcart

sealed class State264_105 {
    data object Loading : State264_105()
    data class Success(val data: String) : State264_105()
    data class Error(val message: String) : State264_105()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}