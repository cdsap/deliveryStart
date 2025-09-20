package com.awesomeapp.weathercomment

sealed class State480_35 {
    data object Loading : State480_35()
    data class Success(val data: String) : State480_35()
    data class Error(val message: String) : State480_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}