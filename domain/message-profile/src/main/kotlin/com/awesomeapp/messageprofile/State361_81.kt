package com.awesomeapp.messageprofile

sealed class State361_81 {
    data object Loading : State361_81()
    data class Success(val data: String) : State361_81()
    data class Error(val message: String) : State361_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}