package com.awesomeapp.commentcomment

sealed class State451_48 {
    data object Loading : State451_48()
    data class Success(val data: String) : State451_48()
    data class Error(val message: String) : State451_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}