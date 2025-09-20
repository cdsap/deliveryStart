package com.awesomeapp.syncprofile

sealed class State358_54 {
    data object Loading : State358_54()
    data class Success(val data: String) : State358_54()
    data class Error(val message: String) : State358_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}