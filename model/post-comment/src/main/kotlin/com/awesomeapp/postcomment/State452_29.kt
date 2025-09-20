package com.awesomeapp.postcomment

sealed class State452_29 {
    data object Loading : State452_29()
    data class Success(val data: String) : State452_29()
    data class Error(val message: String) : State452_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}