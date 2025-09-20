package com.awesomeapp.accountlogin

sealed class State119_54 {
    data object Loading : State119_54()
    data class Success(val data: String) : State119_54()
    data class Error(val message: String) : State119_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}