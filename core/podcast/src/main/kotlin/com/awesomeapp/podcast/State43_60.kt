package com.awesomeapp.podcast

sealed class State43_60 {
    data object Loading : State43_60()
    data class Success(val data: String) : State43_60()
    data class Error(val message: String) : State43_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}