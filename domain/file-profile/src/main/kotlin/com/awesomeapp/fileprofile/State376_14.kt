package com.awesomeapp.fileprofile

sealed class State376_14 {
    data object Loading : State376_14()
    data class Success(val data: String) : State376_14()
    data class Error(val message: String) : State376_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}