package com.awesomeapp.articlelocation

sealed class State630_18 {
    data object Loading : State630_18()
    data class Success(val data: String) : State630_18()
    data class Error(val message: String) : State630_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}