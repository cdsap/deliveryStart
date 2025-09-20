package com.awesomeapp.notificationpost

sealed class State509_111 {
    data object Loading : State509_111()
    data class Success(val data: String) : State509_111()
    data class Error(val message: String) : State509_111()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}