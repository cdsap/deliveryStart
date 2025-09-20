package com.awesomeapp.mediasearch

sealed class State586_126 {
    data object Loading : State586_126()
    data class Success(val data: String) : State586_126()
    data class Error(val message: String) : State586_126()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}