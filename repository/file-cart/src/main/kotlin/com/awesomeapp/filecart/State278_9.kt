package com.awesomeapp.filecart

sealed class State278_9 {
    data object Loading : State278_9()
    data class Success(val data: String) : State278_9()
    data class Error(val message: String) : State278_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}