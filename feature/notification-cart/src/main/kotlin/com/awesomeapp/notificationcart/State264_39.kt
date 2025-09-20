package com.awesomeapp.notificationcart

sealed class State264_39 {
    data object Loading : State264_39()
    data class Success(val data: String) : State264_39()
    data class Error(val message: String) : State264_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}