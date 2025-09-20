package com.awesomeapp.reportsync

sealed class State710_125 {
    data object Loading : State710_125()
    data class Success(val data: String) : State710_125()
    data class Error(val message: String) : State710_125()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}