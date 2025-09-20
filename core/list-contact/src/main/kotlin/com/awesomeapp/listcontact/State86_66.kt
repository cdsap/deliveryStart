package com.awesomeapp.listcontact

sealed class State86_66 {
    data object Loading : State86_66()
    data class Success(val data: String) : State86_66()
    data class Error(val message: String) : State86_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}