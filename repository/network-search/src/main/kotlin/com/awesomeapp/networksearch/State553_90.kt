package com.awesomeapp.networksearch

sealed class State553_90 {
    data object Loading : State553_90()
    data class Success(val data: String) : State553_90()
    data class Error(val message: String) : State553_90()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}