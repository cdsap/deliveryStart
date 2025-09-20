package com.awesomeapp.taskuser

sealed class State322_9 {
    data object Loading : State322_9()
    data class Success(val data: String) : State322_9()
    data class Error(val message: String) : State322_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}