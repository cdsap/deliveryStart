package com.awesomeapp.mediafeed

sealed class State439_9 {
    data object Loading : State439_9()
    data class Success(val data: String) : State439_9()
    data class Error(val message: String) : State439_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}