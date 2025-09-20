package com.awesomeapp.usercart

sealed class State252_63 {
    data object Loading : State252_63()
    data class Success(val data: String) : State252_63()
    data class Error(val message: String) : State252_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}