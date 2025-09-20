package com.awesomeapp.videocart

sealed class State289_60 {
    data object Loading : State289_60()
    data class Success(val data: String) : State289_60()
    data class Error(val message: String) : State289_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}