package com.awesomeapp.analyticsprofile

sealed class State366_58 {
    data object Loading : State366_58()
    data class Success(val data: String) : State366_58()
    data class Error(val message: String) : State366_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}