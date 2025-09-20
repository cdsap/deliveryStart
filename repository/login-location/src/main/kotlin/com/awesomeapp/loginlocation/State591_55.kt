package com.awesomeapp.loginlocation

sealed class State591_55 {
    data object Loading : State591_55()
    data class Success(val data: String) : State591_55()
    data class Error(val message: String) : State591_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}