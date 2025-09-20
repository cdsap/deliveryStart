package com.awesomeapp.shareidentity

sealed class State163_84 {
    data object Loading : State163_84()
    data class Success(val data: String) : State163_84()
    data class Error(val message: String) : State163_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}