package com.awesomeapp.notepost

sealed class State525_45 {
    data object Loading : State525_45()
    data class Success(val data: String) : State525_45()
    data class Error(val message: String) : State525_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}