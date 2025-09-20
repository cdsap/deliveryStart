package com.awesomeapp.logprofile

sealed class State368_71 {
    data object Loading : State368_71()
    data class Success(val data: String) : State368_71()
    data class Error(val message: String) : State368_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}