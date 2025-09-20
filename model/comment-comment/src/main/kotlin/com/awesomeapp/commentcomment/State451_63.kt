package com.awesomeapp.commentcomment

sealed class State451_63 {
    data object Loading : State451_63()
    data class Success(val data: String) : State451_63()
    data class Error(val message: String) : State451_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}