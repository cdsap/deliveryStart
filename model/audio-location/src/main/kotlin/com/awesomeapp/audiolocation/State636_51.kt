package com.awesomeapp.audiolocation

sealed class State636_51 {
    data object Loading : State636_51()
    data class Success(val data: String) : State636_51()
    data class Error(val message: String) : State636_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}