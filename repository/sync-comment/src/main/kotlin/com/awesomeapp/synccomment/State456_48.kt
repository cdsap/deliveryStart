package com.awesomeapp.synccomment

sealed class State456_48 {
    data object Loading : State456_48()
    data class Success(val data: String) : State456_48()
    data class Error(val message: String) : State456_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}