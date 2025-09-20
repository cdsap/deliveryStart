package com.awesomeapp.todocomment

sealed class State477_61 {
    data object Loading : State477_61()
    data class Success(val data: String) : State477_61()
    data class Error(val message: String) : State477_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}