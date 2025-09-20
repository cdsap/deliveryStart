package com.awesomeapp.notificationcart

sealed class State264_60 {
    data object Loading : State264_60()
    data class Success(val data: String) : State264_60()
    data class Error(val message: String) : State264_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}