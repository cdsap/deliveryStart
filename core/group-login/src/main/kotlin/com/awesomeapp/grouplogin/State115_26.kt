package com.awesomeapp.grouplogin

sealed class State115_26 {
    data object Loading : State115_26()
    data class Success(val data: String) : State115_26()
    data class Error(val message: String) : State115_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}