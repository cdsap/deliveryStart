package com.awesomeapp.profilecart

sealed class State253_78 {
    data object Loading : State253_78()
    data class Success(val data: String) : State253_78()
    data class Error(val message: String) : State253_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}