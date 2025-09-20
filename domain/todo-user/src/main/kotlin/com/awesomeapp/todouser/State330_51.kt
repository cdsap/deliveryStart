package com.awesomeapp.todouser

sealed class State330_51 {
    data object Loading : State330_51()
    data class Success(val data: String) : State330_51()
    data class Error(val message: String) : State330_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}