package com.awesomeapp.metricpost

sealed class State517_63 {
    data object Loading : State517_63()
    data class Success(val data: String) : State517_63()
    data class Error(val message: String) : State517_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}