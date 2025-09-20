package com.awesomeapp.locationsearch

sealed class State552_24 {
    data object Loading : State552_24()
    data class Success(val data: String) : State552_24()
    data class Error(val message: String) : State552_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}