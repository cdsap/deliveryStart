package com.awesomeapp.timersearch

sealed class State571_42 {
    data object Loading : State571_42()
    data class Success(val data: String) : State571_42()
    data class Error(val message: String) : State571_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}