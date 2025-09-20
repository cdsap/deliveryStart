package com.awesomeapp.profilelogin

sealed class State106_36 {
    data object Loading : State106_36()
    data class Success(val data: String) : State106_36()
    data class Error(val message: String) : State106_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}