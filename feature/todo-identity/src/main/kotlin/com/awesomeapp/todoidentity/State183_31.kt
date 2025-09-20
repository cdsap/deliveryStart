package com.awesomeapp.todoidentity

sealed class State183_31 {
    data object Loading : State183_31()
    data class Success(val data: String) : State183_31()
    data class Error(val message: String) : State183_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}