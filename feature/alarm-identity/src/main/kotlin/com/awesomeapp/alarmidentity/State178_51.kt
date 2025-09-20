package com.awesomeapp.alarmidentity

sealed class State178_51 {
    data object Loading : State178_51()
    data class Success(val data: String) : State178_51()
    data class Error(val message: String) : State178_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}