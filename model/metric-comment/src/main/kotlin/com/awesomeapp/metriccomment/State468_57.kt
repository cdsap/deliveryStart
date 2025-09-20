package com.awesomeapp.metriccomment

sealed class State468_57 {
    data object Loading : State468_57()
    data class Success(val data: String) : State468_57()
    data class Error(val message: String) : State468_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}