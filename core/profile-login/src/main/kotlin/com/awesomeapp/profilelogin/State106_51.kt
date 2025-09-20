package com.awesomeapp.profilelogin

sealed class State106_51 {
    data object Loading : State106_51()
    data class Success(val data: String) : State106_51()
    data class Error(val message: String) : State106_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}