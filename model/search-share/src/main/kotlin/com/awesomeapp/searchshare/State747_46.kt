package com.awesomeapp.searchshare

sealed class State747_46 {
    data object Loading : State747_46()
    data class Success(val data: String) : State747_46()
    data class Error(val message: String) : State747_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}