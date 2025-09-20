package com.awesomeapp.sessionuser

sealed class State316_116 {
    data object Loading : State316_116()
    data class Success(val data: String) : State316_116()
    data class Error(val message: String) : State316_116()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}