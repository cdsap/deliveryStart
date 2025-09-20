package com.awesomeapp.alarmnetwork

sealed class State668_47 {
    data object Loading : State668_47()
    data class Success(val data: String) : State668_47()
    data class Error(val message: String) : State668_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}