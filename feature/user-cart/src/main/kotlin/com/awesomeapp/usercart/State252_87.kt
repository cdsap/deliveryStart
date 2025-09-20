package com.awesomeapp.usercart

sealed class State252_87 {
    data object Loading : State252_87()
    data class Success(val data: String) : State252_87()
    data class Error(val message: String) : State252_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}