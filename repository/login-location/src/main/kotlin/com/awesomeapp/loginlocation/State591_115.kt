package com.awesomeapp.loginlocation

sealed class State591_115 {
    data object Loading : State591_115()
    data class Success(val data: String) : State591_115()
    data class Error(val message: String) : State591_115()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}