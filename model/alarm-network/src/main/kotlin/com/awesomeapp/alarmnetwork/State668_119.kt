package com.awesomeapp.alarmnetwork

sealed class State668_119 {
    data object Loading : State668_119()
    data class Success(val data: String) : State668_119()
    data class Error(val message: String) : State668_119()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}