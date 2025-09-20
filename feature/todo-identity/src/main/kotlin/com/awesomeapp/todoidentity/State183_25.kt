package com.awesomeapp.todoidentity

sealed class State183_25 {
    data object Loading : State183_25()
    data class Success(val data: String) : State183_25()
    data class Error(val message: String) : State183_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}