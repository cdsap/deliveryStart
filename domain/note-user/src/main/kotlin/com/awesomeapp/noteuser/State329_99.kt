package com.awesomeapp.noteuser

sealed class State329_99 {
    data object Loading : State329_99()
    data class Success(val data: String) : State329_99()
    data class Error(val message: String) : State329_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}