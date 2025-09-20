package com.awesomeapp.session

sealed class State22_36 {
    data object Loading : State22_36()
    data class Success(val data: String) : State22_36()
    data class Error(val message: String) : State22_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}