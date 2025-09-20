package com.awesomeapp.networklogin

sealed class State112_50 {
    data object Loading : State112_50()
    data class Success(val data: String) : State112_50()
    data class Error(val message: String) : State112_50()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}