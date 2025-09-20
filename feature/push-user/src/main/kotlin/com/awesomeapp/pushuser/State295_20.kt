package com.awesomeapp.pushuser

sealed class State295_20 {
    data object Loading : State295_20()
    data class Success(val data: String) : State295_20()
    data class Error(val message: String) : State295_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}