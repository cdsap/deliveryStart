package com.awesomeapp.newslogin

sealed class State139_51 {
    data object Loading : State139_51()
    data class Success(val data: String) : State139_51()
    data class Error(val message: String) : State139_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}