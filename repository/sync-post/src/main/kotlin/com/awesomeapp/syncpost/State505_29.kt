package com.awesomeapp.syncpost

sealed class State505_29 {
    data object Loading : State505_29()
    data class Success(val data: String) : State505_29()
    data class Error(val message: String) : State505_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}