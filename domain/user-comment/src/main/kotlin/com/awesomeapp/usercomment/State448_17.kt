package com.awesomeapp.usercomment

sealed class State448_17 {
    data object Loading : State448_17()
    data class Success(val data: String) : State448_17()
    data class Error(val message: String) : State448_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}