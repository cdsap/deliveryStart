package com.awesomeapp.searchshare

sealed class State747_64 {
    data object Loading : State747_64()
    data class Success(val data: String) : State747_64()
    data class Error(val message: String) : State747_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}