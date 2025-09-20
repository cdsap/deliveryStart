package com.awesomeapp.fileprofile

sealed class State376_56 {
    data object Loading : State376_56()
    data class Success(val data: String) : State376_56()
    data class Error(val message: String) : State376_56()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}