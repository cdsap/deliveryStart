package com.awesomeapp.userpost

sealed class State497_12 {
    data object Loading : State497_12()
    data class Success(val data: String) : State497_12()
    data class Error(val message: String) : State497_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}