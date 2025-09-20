package com.awesomeapp.accountlocation

sealed class State609_13 {
    data object Loading : State609_13()
    data class Success(val data: String) : State609_13()
    data class Error(val message: String) : State609_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}