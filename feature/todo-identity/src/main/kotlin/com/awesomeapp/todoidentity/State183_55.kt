package com.awesomeapp.todoidentity

sealed class State183_55 {
    data object Loading : State183_55()
    data class Success(val data: String) : State183_55()
    data class Error(val message: String) : State183_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}