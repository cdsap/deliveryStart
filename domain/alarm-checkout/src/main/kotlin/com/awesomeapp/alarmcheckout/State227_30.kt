package com.awesomeapp.alarmcheckout

sealed class State227_30 {
    data object Loading : State227_30()
    data class Success(val data: String) : State227_30()
    data class Error(val message: String) : State227_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}