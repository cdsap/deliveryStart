package com.awesomeapp.tasklogin

sealed class State126_37 {
    data object Loading : State126_37()
    data class Success(val data: String) : State126_37()
    data class Error(val message: String) : State126_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}