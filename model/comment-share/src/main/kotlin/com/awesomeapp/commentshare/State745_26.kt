package com.awesomeapp.commentshare

sealed class State745_26 {
    data object Loading : State745_26()
    data class Success(val data: String) : State745_26()
    data class Error(val message: String) : State745_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}