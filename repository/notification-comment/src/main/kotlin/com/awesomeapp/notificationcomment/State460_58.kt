package com.awesomeapp.notificationcomment

sealed class State460_58 {
    data object Loading : State460_58()
    data class Success(val data: String) : State460_58()
    data class Error(val message: String) : State460_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}