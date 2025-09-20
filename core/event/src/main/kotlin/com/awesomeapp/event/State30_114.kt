package com.awesomeapp.event

sealed class State30_114 {
    data object Loading : State30_114()
    data class Success(val data: String) : State30_114()
    data class Error(val message: String) : State30_114()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}