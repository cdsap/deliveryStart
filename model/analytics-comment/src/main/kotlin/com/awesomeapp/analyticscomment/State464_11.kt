package com.awesomeapp.analyticscomment

sealed class State464_11 {
    data object Loading : State464_11()
    data class Success(val data: String) : State464_11()
    data class Error(val message: String) : State464_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}