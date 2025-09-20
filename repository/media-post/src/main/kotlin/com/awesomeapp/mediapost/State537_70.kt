package com.awesomeapp.mediapost

sealed class State537_70 {
    data object Loading : State537_70()
    data class Success(val data: String) : State537_70()
    data class Error(val message: String) : State537_70()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}