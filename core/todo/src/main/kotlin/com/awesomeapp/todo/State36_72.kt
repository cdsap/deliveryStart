package com.awesomeapp.todo

sealed class State36_72 {
    data object Loading : State36_72()
    data class Success(val data: String) : State36_72()
    data class Error(val message: String) : State36_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}