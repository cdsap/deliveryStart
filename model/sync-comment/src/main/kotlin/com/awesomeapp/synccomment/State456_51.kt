package com.awesomeapp.synccomment

sealed class State456_51 {
    data object Loading : State456_51()
    data class Success(val data: String) : State456_51()
    data class Error(val message: String) : State456_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}