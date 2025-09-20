package com.awesomeapp.notesync

sealed class State721_21 {
    data object Loading : State721_21()
    data class Success(val data: String) : State721_21()
    data class Error(val message: String) : State721_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}