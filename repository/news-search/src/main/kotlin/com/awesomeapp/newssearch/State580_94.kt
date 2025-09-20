package com.awesomeapp.newssearch

sealed class State580_94 {
    data object Loading : State580_94()
    data class Success(val data: String) : State580_94()
    data class Error(val message: String) : State580_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}