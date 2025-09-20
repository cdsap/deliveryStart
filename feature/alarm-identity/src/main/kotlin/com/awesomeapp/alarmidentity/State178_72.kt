package com.awesomeapp.alarmidentity

sealed class State178_72 {
    data object Loading : State178_72()
    data class Success(val data: String) : State178_72()
    data class Error(val message: String) : State178_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}