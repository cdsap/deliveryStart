package com.awesomeapp.message

sealed class State18_40 {
    data object Loading : State18_40()
    data class Success(val data: String) : State18_40()
    data class Error(val message: String) : State18_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}