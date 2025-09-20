package com.awesomeapp.pushpost

sealed class State491_9 {
    data object Loading : State491_9()
    data class Success(val data: String) : State491_9()
    data class Error(val message: String) : State491_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}