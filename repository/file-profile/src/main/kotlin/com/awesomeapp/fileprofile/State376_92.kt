package com.awesomeapp.fileprofile

sealed class State376_92 {
    data object Loading : State376_92()
    data class Success(val data: String) : State376_92()
    data class Error(val message: String) : State376_92()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}