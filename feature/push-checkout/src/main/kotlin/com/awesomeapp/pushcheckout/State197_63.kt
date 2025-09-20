package com.awesomeapp.pushcheckout

sealed class State197_63 {
    data object Loading : State197_63()
    data class Success(val data: String) : State197_63()
    data class Error(val message: String) : State197_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}