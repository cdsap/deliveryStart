package com.awesomeapp.profilelogin

sealed class State106_57 {
    data object Loading : State106_57()
    data class Success(val data: String) : State106_57()
    data class Error(val message: String) : State106_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}