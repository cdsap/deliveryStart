package com.awesomeapp.identityuser

sealed class State298_54 {
    data object Loading : State298_54()
    data class Success(val data: String) : State298_54()
    data class Error(val message: String) : State298_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}