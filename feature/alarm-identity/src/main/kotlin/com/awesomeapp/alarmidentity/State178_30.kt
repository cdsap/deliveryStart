package com.awesomeapp.alarmidentity

sealed class State178_30 {
    data object Loading : State178_30()
    data class Success(val data: String) : State178_30()
    data class Error(val message: String) : State178_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}