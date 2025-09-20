package com.awesomeapp.synccomment

sealed class State456_24 {
    data object Loading : State456_24()
    data class Success(val data: String) : State456_24()
    data class Error(val message: String) : State456_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}