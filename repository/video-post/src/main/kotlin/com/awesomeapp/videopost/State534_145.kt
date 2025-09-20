package com.awesomeapp.videopost

sealed class State534_145 {
    data object Loading : State534_145()
    data class Success(val data: String) : State534_145()
    data class Error(val message: String) : State534_145()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}