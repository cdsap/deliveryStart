package com.awesomeapp.reportsync

sealed class State710_131 {
    data object Loading : State710_131()
    data class Success(val data: String) : State710_131()
    data class Error(val message: String) : State710_131()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}