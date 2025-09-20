package com.awesomeapp.searchsync

sealed class State698_27 {
    data object Loading : State698_27()
    data class Success(val data: String) : State698_27()
    data class Error(val message: String) : State698_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}