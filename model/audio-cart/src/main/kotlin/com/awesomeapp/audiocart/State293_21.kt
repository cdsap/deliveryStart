package com.awesomeapp.audiocart

sealed class State293_21 {
    data object Loading : State293_21()
    data class Success(val data: String) : State293_21()
    data class Error(val message: String) : State293_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}