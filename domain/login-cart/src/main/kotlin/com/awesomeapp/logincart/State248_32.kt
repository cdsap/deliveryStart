package com.awesomeapp.logincart

sealed class State248_32 {
    data object Loading : State248_32()
    data class Success(val data: String) : State248_32()
    data class Error(val message: String) : State248_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}