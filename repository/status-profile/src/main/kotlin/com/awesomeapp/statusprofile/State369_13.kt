package com.awesomeapp.statusprofile

sealed class State369_13 {
    data object Loading : State369_13()
    data class Success(val data: String) : State369_13()
    data class Error(val message: String) : State369_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}