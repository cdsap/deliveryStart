package com.awesomeapp.alarmcomment

sealed class State472_92 {
    data object Loading : State472_92()
    data class Success(val data: String) : State472_92()
    data class Error(val message: String) : State472_92()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}