package com.awesomeapp.metricpost

sealed class State517_51 {
    data object Loading : State517_51()
    data class Success(val data: String) : State517_51()
    data class Error(val message: String) : State517_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}