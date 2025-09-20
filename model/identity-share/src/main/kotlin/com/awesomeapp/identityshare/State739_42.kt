package com.awesomeapp.identityshare

sealed class State739_42 {
    data object Loading : State739_42()
    data class Success(val data: String) : State739_42()
    data class Error(val message: String) : State739_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}