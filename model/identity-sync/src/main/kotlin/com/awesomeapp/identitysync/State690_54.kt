package com.awesomeapp.identitysync

sealed class State690_54 {
    data object Loading : State690_54()
    data class Success(val data: String) : State690_54()
    data class Error(val message: String) : State690_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}