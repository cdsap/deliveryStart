package com.awesomeapp.usercomment

sealed class State448_32 {
    data object Loading : State448_32()
    data class Success(val data: String) : State448_32()
    data class Error(val message: String) : State448_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}