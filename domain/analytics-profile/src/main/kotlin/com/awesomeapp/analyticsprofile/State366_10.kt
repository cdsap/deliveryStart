package com.awesomeapp.analyticsprofile

sealed class State366_10 {
    data object Loading : State366_10()
    data class Success(val data: String) : State366_10()
    data class Error(val message: String) : State366_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}