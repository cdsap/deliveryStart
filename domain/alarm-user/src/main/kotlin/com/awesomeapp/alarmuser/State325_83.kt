package com.awesomeapp.alarmuser

sealed class State325_83 {
    data object Loading : State325_83()
    data class Success(val data: String) : State325_83()
    data class Error(val message: String) : State325_83()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}