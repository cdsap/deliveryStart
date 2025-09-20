package com.awesomeapp.fileprofile

sealed class State376_17 {
    data object Loading : State376_17()
    data class Success(val data: String) : State376_17()
    data class Error(val message: String) : State376_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}