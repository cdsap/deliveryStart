package com.awesomeapp.shareidentity

sealed class State163_27 {
    data object Loading : State163_27()
    data class Success(val data: String) : State163_27()
    data class Error(val message: String) : State163_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}