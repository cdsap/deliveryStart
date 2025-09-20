package com.awesomeapp.searchcheckout

sealed class State208_11 {
    data object Loading : State208_11()
    data class Success(val data: String) : State208_11()
    data class Error(val message: String) : State208_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}