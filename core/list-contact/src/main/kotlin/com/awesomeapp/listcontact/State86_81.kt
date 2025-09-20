package com.awesomeapp.listcontact

sealed class State86_81 {
    data object Loading : State86_81()
    data class Success(val data: String) : State86_81()
    data class Error(val message: String) : State86_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}