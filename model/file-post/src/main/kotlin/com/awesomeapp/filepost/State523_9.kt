package com.awesomeapp.filepost

sealed class State523_9 {
    data object Loading : State523_9()
    data class Success(val data: String) : State523_9()
    data class Error(val message: String) : State523_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}