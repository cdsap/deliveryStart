package com.awesomeapp.identityshare

sealed class State739_18 {
    data object Loading : State739_18()
    data class Success(val data: String) : State739_18()
    data class Error(val message: String) : State739_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}