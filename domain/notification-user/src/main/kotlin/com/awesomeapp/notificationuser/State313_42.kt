package com.awesomeapp.notificationuser

sealed class State313_42 {
    data object Loading : State313_42()
    data class Success(val data: String) : State313_42()
    data class Error(val message: String) : State313_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}