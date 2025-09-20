package com.awesomeapp.networklogin

sealed class State112_83 {
    data object Loading : State112_83()
    data class Success(val data: String) : State112_83()
    data class Error(val message: String) : State112_83()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}