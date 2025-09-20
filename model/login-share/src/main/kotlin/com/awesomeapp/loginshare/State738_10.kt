package com.awesomeapp.loginshare

sealed class State738_10 {
    data object Loading : State738_10()
    data class Success(val data: String) : State738_10()
    data class Error(val message: String) : State738_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}