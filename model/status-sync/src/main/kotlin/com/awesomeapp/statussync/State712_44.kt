package com.awesomeapp.statussync

sealed class State712_44 {
    data object Loading : State712_44()
    data class Success(val data: String) : State712_44()
    data class Error(val message: String) : State712_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}