package com.awesomeapp.loginlocation

sealed class State591_40 {
    data object Loading : State591_40()
    data class Success(val data: String) : State591_40()
    data class Error(val message: String) : State591_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}