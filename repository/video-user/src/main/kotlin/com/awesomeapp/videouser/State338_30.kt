package com.awesomeapp.videouser

sealed class State338_30 {
    data object Loading : State338_30()
    data class Success(val data: String) : State338_30()
    data class Error(val message: String) : State338_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}