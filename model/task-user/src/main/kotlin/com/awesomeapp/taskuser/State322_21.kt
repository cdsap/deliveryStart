package com.awesomeapp.taskuser

sealed class State322_21 {
    data object Loading : State322_21()
    data class Success(val data: String) : State322_21()
    data class Error(val message: String) : State322_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}