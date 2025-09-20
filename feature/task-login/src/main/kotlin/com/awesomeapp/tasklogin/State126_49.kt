package com.awesomeapp.tasklogin

sealed class State126_49 {
    data object Loading : State126_49()
    data class Success(val data: String) : State126_49()
    data class Error(val message: String) : State126_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}