package com.awesomeapp.listcomment

sealed class State478_21 {
    data object Loading : State478_21()
    data class Success(val data: String) : State478_21()
    data class Error(val message: String) : State478_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}