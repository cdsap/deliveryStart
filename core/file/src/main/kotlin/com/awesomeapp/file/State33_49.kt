package com.awesomeapp.file

sealed class State33_49 {
    data object Loading : State33_49()
    data class Success(val data: String) : State33_49()
    data class Error(val message: String) : State33_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}