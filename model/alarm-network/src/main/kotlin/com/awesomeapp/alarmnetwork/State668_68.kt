package com.awesomeapp.alarmnetwork

sealed class State668_68 {
    data object Loading : State668_68()
    data class Success(val data: String) : State668_68()
    data class Error(val message: String) : State668_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}