package com.awesomeapp.alarmnetwork

sealed class State668_122 {
    data object Loading : State668_122()
    data class Success(val data: String) : State668_122()
    data class Error(val message: String) : State668_122()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}