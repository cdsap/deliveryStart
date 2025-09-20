package com.awesomeapp.videouser

sealed class State338_36 {
    data object Loading : State338_36()
    data class Success(val data: String) : State338_36()
    data class Error(val message: String) : State338_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}