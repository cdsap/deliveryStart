package com.awesomeapp.notificationlocation

sealed class State607_18 {
    data object Loading : State607_18()
    data class Success(val data: String) : State607_18()
    data class Error(val message: String) : State607_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}