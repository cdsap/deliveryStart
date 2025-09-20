package com.awesomeapp.logincart

sealed class State248_68 {
    data object Loading : State248_68()
    data class Success(val data: String) : State248_68()
    data class Error(val message: String) : State248_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}