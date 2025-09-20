package com.awesomeapp.weathercomment

sealed class State480_107 {
    data object Loading : State480_107()
    data class Success(val data: String) : State480_107()
    data class Error(val message: String) : State480_107()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}