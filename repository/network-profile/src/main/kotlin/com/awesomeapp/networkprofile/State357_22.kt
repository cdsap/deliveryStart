package com.awesomeapp.networkprofile

sealed class State357_22 {
    data object Loading : State357_22()
    data class Success(val data: String) : State357_22()
    data class Error(val message: String) : State357_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}