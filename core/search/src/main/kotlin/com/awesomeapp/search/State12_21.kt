package com.awesomeapp.search

sealed class State12_21 {
    data object Loading : State12_21()
    data class Success(val data: String) : State12_21()
    data class Error(val message: String) : State12_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}