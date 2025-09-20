package com.awesomeapp.videocontact

sealed class State93_28 {
    data object Loading : State93_28()
    data class Success(val data: String) : State93_28()
    data class Error(val message: String) : State93_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}