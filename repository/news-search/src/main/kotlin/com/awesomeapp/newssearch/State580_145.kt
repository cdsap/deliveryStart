package com.awesomeapp.newssearch

sealed class State580_145 {
    data object Loading : State580_145()
    data class Success(val data: String) : State580_145()
    data class Error(val message: String) : State580_145()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}