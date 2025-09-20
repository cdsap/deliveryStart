package com.awesomeapp.userlocation

sealed class State595_20 {
    data object Loading : State595_20()
    data class Success(val data: String) : State595_20()
    data class Error(val message: String) : State595_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}