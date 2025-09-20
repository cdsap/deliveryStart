package com.awesomeapp.notificationcheckout

sealed class State215_68 {
    data object Loading : State215_68()
    data class Success(val data: String) : State215_68()
    data class Error(val message: String) : State215_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}