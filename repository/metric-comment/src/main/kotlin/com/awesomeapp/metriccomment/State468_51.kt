package com.awesomeapp.metriccomment

sealed class State468_51 {
    data object Loading : State468_51()
    data class Success(val data: String) : State468_51()
    data class Error(val message: String) : State468_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}