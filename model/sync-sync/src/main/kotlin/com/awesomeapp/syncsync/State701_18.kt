package com.awesomeapp.syncsync

sealed class State701_18 {
    data object Loading : State701_18()
    data class Success(val data: String) : State701_18()
    data class Error(val message: String) : State701_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}