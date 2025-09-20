package com.awesomeapp.messageuser

sealed class State312_75 {
    data object Loading : State312_75()
    data class Success(val data: String) : State312_75()
    data class Error(val message: String) : State312_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}