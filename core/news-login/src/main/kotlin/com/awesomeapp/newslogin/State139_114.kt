package com.awesomeapp.newslogin

sealed class State139_114 {
    data object Loading : State139_114()
    data class Success(val data: String) : State139_114()
    data class Error(val message: String) : State139_114()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}