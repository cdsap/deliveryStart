package com.awesomeapp.reportsync

sealed class State710_110 {
    data object Loading : State710_110()
    data class Success(val data: String) : State710_110()
    data class Error(val message: String) : State710_110()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}