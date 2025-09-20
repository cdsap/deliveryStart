package com.awesomeapp.alarmprofile

sealed class State374_7 {
    data object Loading : State374_7()
    data class Success(val data: String) : State374_7()
    data class Error(val message: String) : State374_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}