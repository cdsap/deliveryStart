package com.awesomeapp.notesync

sealed class State721_5 {
    data object Loading : State721_5()
    data class Success(val data: String) : State721_5()
    data class Error(val message: String) : State721_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}