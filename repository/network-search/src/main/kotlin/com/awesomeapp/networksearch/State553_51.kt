package com.awesomeapp.networksearch

sealed class State553_51 {
    data object Loading : State553_51()
    data class Success(val data: String) : State553_51()
    data class Error(val message: String) : State553_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}