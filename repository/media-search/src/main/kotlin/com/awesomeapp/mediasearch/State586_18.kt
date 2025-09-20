package com.awesomeapp.mediasearch

sealed class State586_18 {
    data object Loading : State586_18()
    data class Success(val data: String) : State586_18()
    data class Error(val message: String) : State586_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}