package com.awesomeapp.metricfeed

sealed class State419_51 {
    data object Loading : State419_51()
    data class Success(val data: String) : State419_51()
    data class Error(val message: String) : State419_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}