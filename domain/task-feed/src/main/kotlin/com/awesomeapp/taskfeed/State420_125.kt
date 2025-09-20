package com.awesomeapp.taskfeed

sealed class State420_125 {
    data object Loading : State420_125()
    data class Success(val data: String) : State420_125()
    data class Error(val message: String) : State420_125()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}