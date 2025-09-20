package com.awesomeapp.metriccomment

sealed class State468_99 {
    data object Loading : State468_99()
    data class Success(val data: String) : State468_99()
    data class Error(val message: String) : State468_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}