package com.awesomeapp.photocomment

sealed class State486_13 {
    data object Loading : State486_13()
    data class Success(val data: String) : State486_13()
    data class Error(val message: String) : State486_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}