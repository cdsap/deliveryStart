package com.awesomeapp.filepost

sealed class State523_57 {
    data object Loading : State523_57()
    data class Success(val data: String) : State523_57()
    data class Error(val message: String) : State523_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}