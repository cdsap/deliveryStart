package com.awesomeapp.feedcomment

sealed class State450_21 {
    data object Loading : State450_21()
    data class Success(val data: String) : State450_21()
    data class Error(val message: String) : State450_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}