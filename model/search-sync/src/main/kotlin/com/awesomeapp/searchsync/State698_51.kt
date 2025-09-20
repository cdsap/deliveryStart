package com.awesomeapp.searchsync

sealed class State698_51 {
    data object Loading : State698_51()
    data class Success(val data: String) : State698_51()
    data class Error(val message: String) : State698_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}