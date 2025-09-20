package com.awesomeapp.cartsearch

sealed class State545_110 {
    data object Loading : State545_110()
    data class Success(val data: String) : State545_110()
    data class Error(val message: String) : State545_110()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}