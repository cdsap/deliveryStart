package com.awesomeapp.networkshare

sealed class State749_84 {
    data object Loading : State749_84()
    data class Success(val data: String) : State749_84()
    data class Error(val message: String) : State749_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}