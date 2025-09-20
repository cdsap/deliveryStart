package com.awesomeapp.statuslocation

sealed class State614_42 {
    data object Loading : State614_42()
    data class Success(val data: String) : State614_42()
    data class Error(val message: String) : State614_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}