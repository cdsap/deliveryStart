package com.awesomeapp.analyticsprofile

sealed class State366_16 {
    data object Loading : State366_16()
    data class Success(val data: String) : State366_16()
    data class Error(val message: String) : State366_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}