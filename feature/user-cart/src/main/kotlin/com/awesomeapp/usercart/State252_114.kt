package com.awesomeapp.usercart

sealed class State252_114 {
    data object Loading : State252_114()
    data class Success(val data: String) : State252_114()
    data class Error(val message: String) : State252_114()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}