package com.awesomeapp.todocomment

sealed class State477_76 {
    data object Loading : State477_76()
    data class Success(val data: String) : State477_76()
    data class Error(val message: String) : State477_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}