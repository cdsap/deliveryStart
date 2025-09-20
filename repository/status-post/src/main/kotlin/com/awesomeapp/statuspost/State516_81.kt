package com.awesomeapp.statuspost

sealed class State516_81 {
    data object Loading : State516_81()
    data class Success(val data: String) : State516_81()
    data class Error(val message: String) : State516_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}