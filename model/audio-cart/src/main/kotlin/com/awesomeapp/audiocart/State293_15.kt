package com.awesomeapp.audiocart

sealed class State293_15 {
    data object Loading : State293_15()
    data class Success(val data: String) : State293_15()
    data class Error(val message: String) : State293_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}