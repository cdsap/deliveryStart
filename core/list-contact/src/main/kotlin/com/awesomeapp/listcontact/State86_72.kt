package com.awesomeapp.listcontact

sealed class State86_72 {
    data object Loading : State86_72()
    data class Success(val data: String) : State86_72()
    data class Error(val message: String) : State86_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}