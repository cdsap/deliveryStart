package com.awesomeapp.notificationpost

sealed class State509_66 {
    data object Loading : State509_66()
    data class Success(val data: String) : State509_66()
    data class Error(val message: String) : State509_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}