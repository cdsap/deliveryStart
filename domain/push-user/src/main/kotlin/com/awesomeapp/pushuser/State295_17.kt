package com.awesomeapp.pushuser

sealed class State295_17 {
    data object Loading : State295_17()
    data class Success(val data: String) : State295_17()
    data class Error(val message: String) : State295_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}