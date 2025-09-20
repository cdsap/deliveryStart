package com.awesomeapp.fileprofile

sealed class State376_71 {
    data object Loading : State376_71()
    data class Success(val data: String) : State376_71()
    data class Error(val message: String) : State376_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}