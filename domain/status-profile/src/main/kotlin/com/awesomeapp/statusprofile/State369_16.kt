package com.awesomeapp.statusprofile

sealed class State369_16 {
    data object Loading : State369_16()
    data class Success(val data: String) : State369_16()
    data class Error(val message: String) : State369_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}