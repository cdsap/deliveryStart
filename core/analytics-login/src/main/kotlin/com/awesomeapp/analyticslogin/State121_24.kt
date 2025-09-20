package com.awesomeapp.analyticslogin

sealed class State121_24 {
    data object Loading : State121_24()
    data class Success(val data: String) : State121_24()
    data class Error(val message: String) : State121_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}