package com.awesomeapp.alarmcomment

sealed class State472_17 {
    data object Loading : State472_17()
    data class Success(val data: String) : State472_17()
    data class Error(val message: String) : State472_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}