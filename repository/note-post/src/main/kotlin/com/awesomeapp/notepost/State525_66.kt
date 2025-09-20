package com.awesomeapp.notepost

sealed class State525_66 {
    data object Loading : State525_66()
    data class Success(val data: String) : State525_66()
    data class Error(val message: String) : State525_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}