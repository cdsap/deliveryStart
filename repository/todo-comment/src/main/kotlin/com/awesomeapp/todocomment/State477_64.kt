package com.awesomeapp.todocomment

sealed class State477_64 {
    data object Loading : State477_64()
    data class Success(val data: String) : State477_64()
    data class Error(val message: String) : State477_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}