package com.awesomeapp.weathercomment

sealed class State480_53 {
    data object Loading : State480_53()
    data class Success(val data: String) : State480_53()
    data class Error(val message: String) : State480_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}