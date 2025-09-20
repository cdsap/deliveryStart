package com.awesomeapp.metricpost

sealed class State517_48 {
    data object Loading : State517_48()
    data class Success(val data: String) : State517_48()
    data class Error(val message: String) : State517_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}