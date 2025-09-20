package com.awesomeapp.groupfeed

sealed class State409_15 {
    data object Loading : State409_15()
    data class Success(val data: String) : State409_15()
    data class Error(val message: String) : State409_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}