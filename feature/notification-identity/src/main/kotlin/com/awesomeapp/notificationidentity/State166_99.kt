package com.awesomeapp.notificationidentity

sealed class State166_99 {
    data object Loading : State166_99()
    data class Success(val data: String) : State166_99()
    data class Error(val message: String) : State166_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}