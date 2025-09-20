package com.awesomeapp.searchsync

sealed class State698_84 {
    data object Loading : State698_84()
    data class Success(val data: String) : State698_84()
    data class Error(val message: String) : State698_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}