package com.awesomeapp.analyticsprofile

sealed class State366_52 {
    data object Loading : State366_52()
    data class Success(val data: String) : State366_52()
    data class Error(val message: String) : State366_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}