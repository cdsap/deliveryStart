package com.awesomeapp.notecomment

sealed class State476_68 {
    data object Loading : State476_68()
    data class Success(val data: String) : State476_68()
    data class Error(val message: String) : State476_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}