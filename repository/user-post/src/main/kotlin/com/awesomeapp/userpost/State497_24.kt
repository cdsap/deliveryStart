package com.awesomeapp.userpost

sealed class State497_24 {
    data object Loading : State497_24()
    data class Success(val data: String) : State497_24()
    data class Error(val message: String) : State497_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}