package com.awesomeapp.usercomment

sealed class State448_41 {
    data object Loading : State448_41()
    data class Success(val data: String) : State448_41()
    data class Error(val message: String) : State448_41()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}