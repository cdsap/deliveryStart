package com.awesomeapp.fileprofile

sealed class State376_74 {
    data object Loading : State376_74()
    data class Success(val data: String) : State376_74()
    data class Error(val message: String) : State376_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}