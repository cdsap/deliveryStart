package com.awesomeapp.alarmuser

sealed class State325_53 {
    data object Loading : State325_53()
    data class Success(val data: String) : State325_53()
    data class Error(val message: String) : State325_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}