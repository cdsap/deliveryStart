package com.awesomeapp.taskfeed

sealed class State420_98 {
    data object Loading : State420_98()
    data class Success(val data: String) : State420_98()
    data class Error(val message: String) : State420_98()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}