package com.awesomeapp.todocomment

sealed class State477_13 {
    data object Loading : State477_13()
    data class Success(val data: String) : State477_13()
    data class Error(val message: String) : State477_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}