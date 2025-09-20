package com.awesomeapp.networkprofile

sealed class State357_40 {
    data object Loading : State357_40()
    data class Success(val data: String) : State357_40()
    data class Error(val message: String) : State357_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}