package com.awesomeapp.articlelocation

sealed class State630_57 {
    data object Loading : State630_57()
    data class Success(val data: String) : State630_57()
    data class Error(val message: String) : State630_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}