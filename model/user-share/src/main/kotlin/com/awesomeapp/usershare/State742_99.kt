package com.awesomeapp.usershare

sealed class State742_99 {
    data object Loading : State742_99()
    data class Success(val data: String) : State742_99()
    data class Error(val message: String) : State742_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}