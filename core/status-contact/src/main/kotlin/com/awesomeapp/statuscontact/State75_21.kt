package com.awesomeapp.statuscontact

sealed class State75_21 {
    data object Loading : State75_21()
    data class Success(val data: String) : State75_21()
    data class Error(val message: String) : State75_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}