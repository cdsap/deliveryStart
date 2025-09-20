package com.awesomeapp.todoprofile

sealed class State379_120 {
    data object Loading : State379_120()
    data class Success(val data: String) : State379_120()
    data class Error(val message: String) : State379_120()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}