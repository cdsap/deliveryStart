package com.awesomeapp.groupfeed

sealed class State409_27 {
    data object Loading : State409_27()
    data class Success(val data: String) : State409_27()
    data class Error(val message: String) : State409_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}