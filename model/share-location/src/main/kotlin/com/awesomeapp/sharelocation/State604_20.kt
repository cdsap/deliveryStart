package com.awesomeapp.sharelocation

sealed class State604_20 {
    data object Loading : State604_20()
    data class Success(val data: String) : State604_20()
    data class Error(val message: String) : State604_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}