package com.awesomeapp.identityshare

sealed class State739_27 {
    data object Loading : State739_27()
    data class Success(val data: String) : State739_27()
    data class Error(val message: String) : State739_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}