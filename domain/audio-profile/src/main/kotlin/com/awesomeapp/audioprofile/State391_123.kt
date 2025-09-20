package com.awesomeapp.audioprofile

sealed class State391_123 {
    data object Loading : State391_123()
    data class Success(val data: String) : State391_123()
    data class Error(val message: String) : State391_123()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}