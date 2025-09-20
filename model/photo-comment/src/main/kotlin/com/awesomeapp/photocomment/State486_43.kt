package com.awesomeapp.photocomment

sealed class State486_43 {
    data object Loading : State486_43()
    data class Success(val data: String) : State486_43()
    data class Error(val message: String) : State486_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}