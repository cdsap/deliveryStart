package com.awesomeapp.eventlogin

sealed class State128_14 {
    data object Loading : State128_14()
    data class Success(val data: String) : State128_14()
    data class Error(val message: String) : State128_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}