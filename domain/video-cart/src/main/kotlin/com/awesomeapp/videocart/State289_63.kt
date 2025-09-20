package com.awesomeapp.videocart

sealed class State289_63 {
    data object Loading : State289_63()
    data class Success(val data: String) : State289_63()
    data class Error(val message: String) : State289_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}