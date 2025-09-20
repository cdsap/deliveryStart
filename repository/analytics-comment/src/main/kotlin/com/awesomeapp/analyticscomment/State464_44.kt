package com.awesomeapp.analyticscomment

sealed class State464_44 {
    data object Loading : State464_44()
    data class Success(val data: String) : State464_44()
    data class Error(val message: String) : State464_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}