package com.awesomeapp.comment

sealed class State10_56 {
    data object Loading : State10_56()
    data class Success(val data: String) : State10_56()
    data class Error(val message: String) : State10_56()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}