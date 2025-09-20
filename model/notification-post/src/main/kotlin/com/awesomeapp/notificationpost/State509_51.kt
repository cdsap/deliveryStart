package com.awesomeapp.notificationpost

sealed class State509_51 {
    data object Loading : State509_51()
    data class Success(val data: String) : State509_51()
    data class Error(val message: String) : State509_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}