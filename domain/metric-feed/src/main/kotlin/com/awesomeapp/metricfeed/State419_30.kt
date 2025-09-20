package com.awesomeapp.metricfeed

sealed class State419_30 {
    data object Loading : State419_30()
    data class Success(val data: String) : State419_30()
    data class Error(val message: String) : State419_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}