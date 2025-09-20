package com.awesomeapp.pushuser

sealed class State295_53 {
    data object Loading : State295_53()
    data class Success(val data: String) : State295_53()
    data class Error(val message: String) : State295_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}