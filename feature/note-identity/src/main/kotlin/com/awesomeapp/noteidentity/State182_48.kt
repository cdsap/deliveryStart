package com.awesomeapp.noteidentity

sealed class State182_48 {
    data object Loading : State182_48()
    data class Success(val data: String) : State182_48()
    data class Error(val message: String) : State182_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}