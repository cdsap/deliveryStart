package com.awesomeapp.newslogin

sealed class State139_90 {
    data object Loading : State139_90()
    data class Success(val data: String) : State139_90()
    data class Error(val message: String) : State139_90()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}