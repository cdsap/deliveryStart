package com.awesomeapp.notepost

sealed class State525_60 {
    data object Loading : State525_60()
    data class Success(val data: String) : State525_60()
    data class Error(val message: String) : State525_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}