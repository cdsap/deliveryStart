package com.awesomeapp.reportsync

sealed class State710_17 {
    data object Loading : State710_17()
    data class Success(val data: String) : State710_17()
    data class Error(val message: String) : State710_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}