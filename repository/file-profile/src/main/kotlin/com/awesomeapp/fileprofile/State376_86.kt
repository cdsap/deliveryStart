package com.awesomeapp.fileprofile

sealed class State376_86 {
    data object Loading : State376_86()
    data class Success(val data: String) : State376_86()
    data class Error(val message: String) : State376_86()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}