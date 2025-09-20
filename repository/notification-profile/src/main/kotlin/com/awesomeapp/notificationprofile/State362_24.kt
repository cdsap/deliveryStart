package com.awesomeapp.notificationprofile

sealed class State362_24 {
    data object Loading : State362_24()
    data class Success(val data: String) : State362_24()
    data class Error(val message: String) : State362_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}