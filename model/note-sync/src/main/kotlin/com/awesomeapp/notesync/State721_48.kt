package com.awesomeapp.notesync

sealed class State721_48 {
    data object Loading : State721_48()
    data class Success(val data: String) : State721_48()
    data class Error(val message: String) : State721_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}