package com.awesomeapp.session

sealed class State22_48 {
    data object Loading : State22_48()
    data class Success(val data: String) : State22_48()
    data class Error(val message: String) : State22_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}