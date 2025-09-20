package com.awesomeapp.newslogin

sealed class State139_15 {
    data object Loading : State139_15()
    data class Success(val data: String) : State139_15()
    data class Error(val message: String) : State139_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}