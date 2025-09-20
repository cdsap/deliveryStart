package com.awesomeapp.metriccheckout

sealed class State223_24 {
    data object Loading : State223_24()
    data class Success(val data: String) : State223_24()
    data class Error(val message: String) : State223_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}