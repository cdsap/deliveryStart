package com.awesomeapp.alarmcomment

sealed class State472_41 {
    data object Loading : State472_41()
    data class Success(val data: String) : State472_41()
    data class Error(val message: String) : State472_41()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}