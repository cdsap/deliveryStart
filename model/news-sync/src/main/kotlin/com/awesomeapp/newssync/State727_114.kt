package com.awesomeapp.newssync

sealed class State727_114 {
    data object Loading : State727_114()
    data class Success(val data: String) : State727_114()
    data class Error(val message: String) : State727_114()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}