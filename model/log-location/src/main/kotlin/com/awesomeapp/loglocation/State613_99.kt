package com.awesomeapp.loglocation

sealed class State613_99 {
    data object Loading : State613_99()
    data class Success(val data: String) : State613_99()
    data class Error(val message: String) : State613_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}