package com.awesomeapp.usershare

sealed class State742_36 {
    data object Loading : State742_36()
    data class Success(val data: String) : State742_36()
    data class Error(val message: String) : State742_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}