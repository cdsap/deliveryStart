package com.awesomeapp.networklogin

sealed class State112_104 {
    data object Loading : State112_104()
    data class Success(val data: String) : State112_104()
    data class Error(val message: String) : State112_104()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}