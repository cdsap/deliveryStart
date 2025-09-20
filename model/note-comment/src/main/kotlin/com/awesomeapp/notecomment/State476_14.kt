package com.awesomeapp.notecomment

sealed class State476_14 {
    data object Loading : State476_14()
    data class Success(val data: String) : State476_14()
    data class Error(val message: String) : State476_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}