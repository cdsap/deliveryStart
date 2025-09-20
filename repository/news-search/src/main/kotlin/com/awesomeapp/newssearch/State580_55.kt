package com.awesomeapp.newssearch

sealed class State580_55 {
    data object Loading : State580_55()
    data class Success(val data: String) : State580_55()
    data class Error(val message: String) : State580_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}