package com.awesomeapp.alarmcheckout

sealed class State227_36 {
    data object Loading : State227_36()
    data class Success(val data: String) : State227_36()
    data class Error(val message: String) : State227_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}