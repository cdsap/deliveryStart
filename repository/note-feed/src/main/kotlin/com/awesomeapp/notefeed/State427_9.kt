package com.awesomeapp.notefeed

sealed class State427_9 {
    data object Loading : State427_9()
    data class Success(val data: String) : State427_9()
    data class Error(val message: String) : State427_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}