package com.awesomeapp.notificationuser

sealed class State313_126 {
    data object Loading : State313_126()
    data class Success(val data: String) : State313_126()
    data class Error(val message: String) : State313_126()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}