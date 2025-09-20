package com.awesomeapp.mediacomment

sealed class State488_95 {
    data object Loading : State488_95()
    data class Success(val data: String) : State488_95()
    data class Error(val message: String) : State488_95()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}