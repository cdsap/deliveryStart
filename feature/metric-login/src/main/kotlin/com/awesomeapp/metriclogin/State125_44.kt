package com.awesomeapp.metriclogin

sealed class State125_44 {
    data object Loading : State125_44()
    data class Success(val data: String) : State125_44()
    data class Error(val message: String) : State125_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}