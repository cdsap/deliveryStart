package com.awesomeapp.statussearch

sealed class State565_11 {
    data object Loading : State565_11()
    data class Success(val data: String) : State565_11()
    data class Error(val message: String) : State565_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}