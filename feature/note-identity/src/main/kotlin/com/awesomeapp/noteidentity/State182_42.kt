package com.awesomeapp.noteidentity

sealed class State182_42 {
    data object Loading : State182_42()
    data class Success(val data: String) : State182_42()
    data class Error(val message: String) : State182_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}