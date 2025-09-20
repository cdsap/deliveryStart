package com.awesomeapp.loginnetwork

sealed class State640_13 {
    data object Loading : State640_13()
    data class Success(val data: String) : State640_13()
    data class Error(val message: String) : State640_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}