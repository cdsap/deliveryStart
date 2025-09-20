package com.awesomeapp.networksearch

sealed class State553_36 {
    data object Loading : State553_36()
    data class Success(val data: String) : State553_36()
    data class Error(val message: String) : State553_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}