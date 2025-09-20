package com.awesomeapp.notificationuser

sealed class State313_120 {
    data object Loading : State313_120()
    data class Success(val data: String) : State313_120()
    data class Error(val message: String) : State313_120()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}