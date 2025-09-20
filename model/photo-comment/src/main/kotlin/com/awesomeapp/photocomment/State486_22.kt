package com.awesomeapp.photocomment

sealed class State486_22 {
    data object Loading : State486_22()
    data class Success(val data: String) : State486_22()
    data class Error(val message: String) : State486_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}