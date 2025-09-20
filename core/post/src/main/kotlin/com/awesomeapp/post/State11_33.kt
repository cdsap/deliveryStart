package com.awesomeapp.post

sealed class State11_33 {
    data object Loading : State11_33()
    data class Success(val data: String) : State11_33()
    data class Error(val message: String) : State11_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}