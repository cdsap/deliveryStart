package com.awesomeapp.metriccomment

sealed class State468_39 {
    data object Loading : State468_39()
    data class Success(val data: String) : State468_39()
    data class Error(val message: String) : State468_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}