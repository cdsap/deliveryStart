package com.awesomeapp.loglogin

sealed class State123_76 {
    data object Loading : State123_76()
    data class Success(val data: String) : State123_76()
    data class Error(val message: String) : State123_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}