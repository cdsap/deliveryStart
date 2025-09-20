package com.awesomeapp.shareidentity

sealed class State163_39 {
    data object Loading : State163_39()
    data class Success(val data: String) : State163_39()
    data class Error(val message: String) : State163_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}