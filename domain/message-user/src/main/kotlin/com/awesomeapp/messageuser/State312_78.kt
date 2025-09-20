package com.awesomeapp.messageuser

sealed class State312_78 {
    data object Loading : State312_78()
    data class Success(val data: String) : State312_78()
    data class Error(val message: String) : State312_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}