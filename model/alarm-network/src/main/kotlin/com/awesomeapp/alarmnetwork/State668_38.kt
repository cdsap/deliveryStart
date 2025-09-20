package com.awesomeapp.alarmnetwork

sealed class State668_38 {
    data object Loading : State668_38()
    data class Success(val data: String) : State668_38()
    data class Error(val message: String) : State668_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}