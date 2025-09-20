package com.awesomeapp.analyticsprofile

sealed class State366_88 {
    data object Loading : State366_88()
    data class Success(val data: String) : State366_88()
    data class Error(val message: String) : State366_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}