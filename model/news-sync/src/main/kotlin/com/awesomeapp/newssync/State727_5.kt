package com.awesomeapp.newssync

sealed class State727_5 {
    data object Loading : State727_5()
    data class Success(val data: String) : State727_5()
    data class Error(val message: String) : State727_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}