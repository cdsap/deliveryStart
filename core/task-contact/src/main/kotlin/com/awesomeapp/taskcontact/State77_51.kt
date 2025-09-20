package com.awesomeapp.taskcontact

sealed class State77_51 {
    data object Loading : State77_51()
    data class Success(val data: String) : State77_51()
    data class Error(val message: String) : State77_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}