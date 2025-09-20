package com.awesomeapp.searchshare

sealed class State747_88 {
    data object Loading : State747_88()
    data class Success(val data: String) : State747_88()
    data class Error(val message: String) : State747_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}