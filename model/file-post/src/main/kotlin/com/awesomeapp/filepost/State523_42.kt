package com.awesomeapp.filepost

sealed class State523_42 {
    data object Loading : State523_42()
    data class Success(val data: String) : State523_42()
    data class Error(val message: String) : State523_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}