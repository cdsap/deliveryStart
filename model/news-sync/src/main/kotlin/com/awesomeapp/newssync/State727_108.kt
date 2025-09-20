package com.awesomeapp.newssync

sealed class State727_108 {
    data object Loading : State727_108()
    data class Success(val data: String) : State727_108()
    data class Error(val message: String) : State727_108()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}