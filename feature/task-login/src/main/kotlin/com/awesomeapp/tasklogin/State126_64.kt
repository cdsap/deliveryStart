package com.awesomeapp.tasklogin

sealed class State126_64 {
    data object Loading : State126_64()
    data class Success(val data: String) : State126_64()
    data class Error(val message: String) : State126_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}