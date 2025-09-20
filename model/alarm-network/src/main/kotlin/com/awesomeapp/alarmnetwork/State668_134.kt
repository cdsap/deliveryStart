package com.awesomeapp.alarmnetwork

sealed class State668_134 {
    data object Loading : State668_134()
    data class Success(val data: String) : State668_134()
    data class Error(val message: String) : State668_134()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}