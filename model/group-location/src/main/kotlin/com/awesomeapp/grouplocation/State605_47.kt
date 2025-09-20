package com.awesomeapp.grouplocation

sealed class State605_47 {
    data object Loading : State605_47()
    data class Success(val data: String) : State605_47()
    data class Error(val message: String) : State605_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}