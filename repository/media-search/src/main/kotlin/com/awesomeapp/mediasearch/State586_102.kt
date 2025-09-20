package com.awesomeapp.mediasearch

sealed class State586_102 {
    data object Loading : State586_102()
    data class Success(val data: String) : State586_102()
    data class Error(val message: String) : State586_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}