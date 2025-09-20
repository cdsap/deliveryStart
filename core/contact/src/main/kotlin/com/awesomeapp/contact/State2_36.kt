package com.awesomeapp.contact

sealed class State2_36 {
    data object Loading : State2_36()
    data class Success(val data: String) : State2_36()
    data class Error(val message: String) : State2_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}