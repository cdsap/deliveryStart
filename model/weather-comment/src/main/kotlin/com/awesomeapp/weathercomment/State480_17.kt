package com.awesomeapp.weathercomment

sealed class State480_17 {
    data object Loading : State480_17()
    data class Success(val data: String) : State480_17()
    data class Error(val message: String) : State480_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}