package com.awesomeapp.sessionuser

sealed class State316_128 {
    data object Loading : State316_128()
    data class Success(val data: String) : State316_128()
    data class Error(val message: String) : State316_128()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}