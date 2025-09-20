package com.awesomeapp.statuspost

sealed class State516_99 {
    data object Loading : State516_99()
    data class Success(val data: String) : State516_99()
    data class Error(val message: String) : State516_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}