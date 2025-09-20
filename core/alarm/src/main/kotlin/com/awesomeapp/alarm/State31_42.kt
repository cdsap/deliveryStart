package com.awesomeapp.alarm

sealed class State31_42 {
    data object Loading : State31_42()
    data class Success(val data: String) : State31_42()
    data class Error(val message: String) : State31_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}