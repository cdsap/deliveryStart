package com.awesomeapp.todouser

sealed class State330_21 {
    data object Loading : State330_21()
    data class Success(val data: String) : State330_21()
    data class Error(val message: String) : State330_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}