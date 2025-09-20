package com.awesomeapp.mediacomment

sealed class State488_119 {
    data object Loading : State488_119()
    data class Success(val data: String) : State488_119()
    data class Error(val message: String) : State488_119()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}