package com.awesomeapp.notificationpost

sealed class State509_78 {
    data object Loading : State509_78()
    data class Success(val data: String) : State509_78()
    data class Error(val message: String) : State509_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}