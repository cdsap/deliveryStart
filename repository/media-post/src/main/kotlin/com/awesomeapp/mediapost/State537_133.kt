package com.awesomeapp.mediapost

sealed class State537_133 {
    data object Loading : State537_133()
    data class Success(val data: String) : State537_133()
    data class Error(val message: String) : State537_133()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}