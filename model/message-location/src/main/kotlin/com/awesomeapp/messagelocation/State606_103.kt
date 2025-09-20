package com.awesomeapp.messagelocation

sealed class State606_103 {
    data object Loading : State606_103()
    data class Success(val data: String) : State606_103()
    data class Error(val message: String) : State606_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}