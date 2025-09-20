package com.awesomeapp.alarmcheckout

sealed class State227_21 {
    data object Loading : State227_21()
    data class Success(val data: String) : State227_21()
    data class Error(val message: String) : State227_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}