package com.awesomeapp.videocontact

sealed class State93_22 {
    data object Loading : State93_22()
    data class Success(val data: String) : State93_22()
    data class Error(val message: String) : State93_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}