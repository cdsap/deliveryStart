package com.awesomeapp.alarmuser

sealed class State325_59 {
    data object Loading : State325_59()
    data class Success(val data: String) : State325_59()
    data class Error(val message: String) : State325_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}