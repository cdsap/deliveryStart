package com.awesomeapp.metricfeed

sealed class State419_84 {
    data object Loading : State419_84()
    data class Success(val data: String) : State419_84()
    data class Error(val message: String) : State419_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}