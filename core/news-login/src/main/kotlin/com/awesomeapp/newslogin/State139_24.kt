package com.awesomeapp.newslogin

sealed class State139_24 {
    data object Loading : State139_24()
    data class Success(val data: String) : State139_24()
    data class Error(val message: String) : State139_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}