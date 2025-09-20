package com.awesomeapp.syncprofile

sealed class State358_99 {
    data object Loading : State358_99()
    data class Success(val data: String) : State358_99()
    data class Error(val message: String) : State358_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}