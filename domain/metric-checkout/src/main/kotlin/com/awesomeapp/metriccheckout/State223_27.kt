package com.awesomeapp.metriccheckout

sealed class State223_27 {
    data object Loading : State223_27()
    data class Success(val data: String) : State223_27()
    data class Error(val message: String) : State223_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}