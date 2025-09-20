package com.awesomeapp.syncshare

sealed class State750_36 {
    data object Loading : State750_36()
    data class Success(val data: String) : State750_36()
    data class Error(val message: String) : State750_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}