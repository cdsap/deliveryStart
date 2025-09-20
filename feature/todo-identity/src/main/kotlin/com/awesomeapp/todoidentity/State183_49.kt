package com.awesomeapp.todoidentity

sealed class State183_49 {
    data object Loading : State183_49()
    data class Success(val data: String) : State183_49()
    data class Error(val message: String) : State183_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}