package com.awesomeapp.statuscomment

sealed class State467_84 {
    data object Loading : State467_84()
    data class Success(val data: String) : State467_84()
    data class Error(val message: String) : State467_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}