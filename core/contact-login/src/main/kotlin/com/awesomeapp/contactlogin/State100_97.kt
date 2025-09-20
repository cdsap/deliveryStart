package com.awesomeapp.contactlogin

sealed class State100_97 {
    data object Loading : State100_97()
    data class Success(val data: String) : State100_97()
    data class Error(val message: String) : State100_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}