package com.awesomeapp.gallerylocation

sealed class State634_12 {
    data object Loading : State634_12()
    data class Success(val data: String) : State634_12()
    data class Error(val message: String) : State634_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}