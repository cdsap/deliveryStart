package com.awesomeapp.metriclogin

sealed class State125_11 {
    data object Loading : State125_11()
    data class Success(val data: String) : State125_11()
    data class Error(val message: String) : State125_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}