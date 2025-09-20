package com.awesomeapp.videocontact

sealed class State93_43 {
    data object Loading : State93_43()
    data class Success(val data: String) : State93_43()
    data class Error(val message: String) : State93_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}