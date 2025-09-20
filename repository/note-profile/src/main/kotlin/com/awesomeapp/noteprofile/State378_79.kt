package com.awesomeapp.noteprofile

sealed class State378_79 {
    data object Loading : State378_79()
    data class Success(val data: String) : State378_79()
    data class Error(val message: String) : State378_79()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}