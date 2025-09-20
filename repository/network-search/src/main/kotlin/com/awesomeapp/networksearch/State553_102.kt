package com.awesomeapp.networksearch

sealed class State553_102 {
    data object Loading : State553_102()
    data class Success(val data: String) : State553_102()
    data class Error(val message: String) : State553_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}