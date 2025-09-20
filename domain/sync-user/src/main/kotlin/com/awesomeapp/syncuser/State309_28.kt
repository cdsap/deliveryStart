package com.awesomeapp.syncuser

sealed class State309_28 {
    data object Loading : State309_28()
    data class Success(val data: String) : State309_28()
    data class Error(val message: String) : State309_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}