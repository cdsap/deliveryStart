package com.awesomeapp.metricfeed

sealed class State419_18 {
    data object Loading : State419_18()
    data class Success(val data: String) : State419_18()
    data class Error(val message: String) : State419_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}