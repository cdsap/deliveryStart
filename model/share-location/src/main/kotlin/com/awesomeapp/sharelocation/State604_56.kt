package com.awesomeapp.sharelocation

sealed class State604_56 {
    data object Loading : State604_56()
    data class Success(val data: String) : State604_56()
    data class Error(val message: String) : State604_56()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}