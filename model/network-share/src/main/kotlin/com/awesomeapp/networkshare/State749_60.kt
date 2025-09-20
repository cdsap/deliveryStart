package com.awesomeapp.networkshare

sealed class State749_60 {
    data object Loading : State749_60()
    data class Success(val data: String) : State749_60()
    data class Error(val message: String) : State749_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}