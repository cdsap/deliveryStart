package com.awesomeapp.messageuser

sealed class State312_51 {
    data object Loading : State312_51()
    data class Success(val data: String) : State312_51()
    data class Error(val message: String) : State312_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}