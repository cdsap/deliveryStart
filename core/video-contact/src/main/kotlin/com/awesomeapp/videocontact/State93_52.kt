package com.awesomeapp.videocontact

sealed class State93_52 {
    data object Loading : State93_52()
    data class Success(val data: String) : State93_52()
    data class Error(val message: String) : State93_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}