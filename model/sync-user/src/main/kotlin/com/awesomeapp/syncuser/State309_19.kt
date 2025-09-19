package com.awesomeapp.syncuser

sealed class State309_19 {
    data object Loading : State309_19()
    data class Success(val data: String) : State309_19()
    data class Error(val message: String) : State309_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}