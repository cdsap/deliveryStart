package com.awesomeapp.notificationlocation

sealed class State607_51 {
    data object Loading : State607_51()
    data class Success(val data: String) : State607_51()
    data class Error(val message: String) : State607_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}