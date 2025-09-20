package com.awesomeapp.shareidentity

sealed class State163_48 {
    data object Loading : State163_48()
    data class Success(val data: String) : State163_48()
    data class Error(val message: String) : State163_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}