package com.awesomeapp.networkprofile

sealed class State357_13 {
    data object Loading : State357_13()
    data class Success(val data: String) : State357_13()
    data class Error(val message: String) : State357_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}