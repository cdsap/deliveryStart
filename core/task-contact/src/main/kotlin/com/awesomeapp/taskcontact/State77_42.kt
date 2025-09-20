package com.awesomeapp.taskcontact

sealed class State77_42 {
    data object Loading : State77_42()
    data class Success(val data: String) : State77_42()
    data class Error(val message: String) : State77_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}