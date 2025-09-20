package com.awesomeapp.newssearch

sealed class State580_130 {
    data object Loading : State580_130()
    data class Success(val data: String) : State580_130()
    data class Error(val message: String) : State580_130()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}