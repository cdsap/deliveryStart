package com.awesomeapp.tasklogin

sealed class State126_46 {
    data object Loading : State126_46()
    data class Success(val data: String) : State126_46()
    data class Error(val message: String) : State126_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}