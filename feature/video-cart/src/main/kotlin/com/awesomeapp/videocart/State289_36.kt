package com.awesomeapp.videocart

sealed class State289_36 {
    data object Loading : State289_36()
    data class Success(val data: String) : State289_36()
    data class Error(val message: String) : State289_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}