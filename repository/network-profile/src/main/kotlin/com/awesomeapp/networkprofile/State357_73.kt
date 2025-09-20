package com.awesomeapp.networkprofile

sealed class State357_73 {
    data object Loading : State357_73()
    data class Success(val data: String) : State357_73()
    data class Error(val message: String) : State357_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}