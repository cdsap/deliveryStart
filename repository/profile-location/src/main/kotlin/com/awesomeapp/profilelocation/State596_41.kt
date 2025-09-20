package com.awesomeapp.profilelocation

sealed class State596_41 {
    data object Loading : State596_41()
    data class Success(val data: String) : State596_41()
    data class Error(val message: String) : State596_41()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}