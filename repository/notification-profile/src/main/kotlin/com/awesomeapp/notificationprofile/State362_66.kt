package com.awesomeapp.notificationprofile

sealed class State362_66 {
    data object Loading : State362_66()
    data class Success(val data: String) : State362_66()
    data class Error(val message: String) : State362_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}