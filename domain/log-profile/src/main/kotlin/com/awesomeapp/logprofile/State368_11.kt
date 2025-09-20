package com.awesomeapp.logprofile

sealed class State368_11 {
    data object Loading : State368_11()
    data class Success(val data: String) : State368_11()
    data class Error(val message: String) : State368_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}