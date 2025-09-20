package com.awesomeapp.identityuser

sealed class State298_42 {
    data object Loading : State298_42()
    data class Success(val data: String) : State298_42()
    data class Error(val message: String) : State298_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}