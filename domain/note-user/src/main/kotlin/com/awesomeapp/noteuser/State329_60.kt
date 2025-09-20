package com.awesomeapp.noteuser

sealed class State329_60 {
    data object Loading : State329_60()
    data class Success(val data: String) : State329_60()
    data class Error(val message: String) : State329_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}