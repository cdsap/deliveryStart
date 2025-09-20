package com.awesomeapp.networknetwork

sealed class State651_9 {
    data object Loading : State651_9()
    data class Success(val data: String) : State651_9()
    data class Error(val message: String) : State651_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}