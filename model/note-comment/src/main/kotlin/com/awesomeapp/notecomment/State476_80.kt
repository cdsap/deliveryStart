package com.awesomeapp.notecomment

sealed class State476_80 {
    data object Loading : State476_80()
    data class Success(val data: String) : State476_80()
    data class Error(val message: String) : State476_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}