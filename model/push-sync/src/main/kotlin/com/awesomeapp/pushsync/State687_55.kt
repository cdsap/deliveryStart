package com.awesomeapp.pushsync

sealed class State687_55 {
    data object Loading : State687_55()
    data class Success(val data: String) : State687_55()
    data class Error(val message: String) : State687_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}