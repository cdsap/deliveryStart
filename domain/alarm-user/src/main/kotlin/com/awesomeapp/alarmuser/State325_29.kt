package com.awesomeapp.alarmuser

sealed class State325_29 {
    data object Loading : State325_29()
    data class Success(val data: String) : State325_29()
    data class Error(val message: String) : State325_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}