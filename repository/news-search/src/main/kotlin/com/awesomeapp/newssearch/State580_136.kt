package com.awesomeapp.newssearch

sealed class State580_136 {
    data object Loading : State580_136()
    data class Success(val data: String) : State580_136()
    data class Error(val message: String) : State580_136()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}