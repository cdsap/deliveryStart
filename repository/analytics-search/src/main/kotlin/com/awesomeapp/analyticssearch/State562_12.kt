package com.awesomeapp.analyticssearch

sealed class State562_12 {
    data object Loading : State562_12()
    data class Success(val data: String) : State562_12()
    data class Error(val message: String) : State562_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}