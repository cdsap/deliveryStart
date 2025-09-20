package com.awesomeapp.identityshare

sealed class State739_36 {
    data object Loading : State739_36()
    data class Success(val data: String) : State739_36()
    data class Error(val message: String) : State739_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}