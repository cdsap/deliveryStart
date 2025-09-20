package com.awesomeapp.noteprofile

sealed class State378_49 {
    data object Loading : State378_49()
    data class Success(val data: String) : State378_49()
    data class Error(val message: String) : State378_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}