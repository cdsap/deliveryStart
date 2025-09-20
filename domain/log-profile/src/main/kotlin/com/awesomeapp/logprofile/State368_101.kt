package com.awesomeapp.logprofile

sealed class State368_101 {
    data object Loading : State368_101()
    data class Success(val data: String) : State368_101()
    data class Error(val message: String) : State368_101()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}