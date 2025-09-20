package com.awesomeapp.notificationprofile

sealed class State362_90 {
    data object Loading : State362_90()
    data class Success(val data: String) : State362_90()
    data class Error(val message: String) : State362_90()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}