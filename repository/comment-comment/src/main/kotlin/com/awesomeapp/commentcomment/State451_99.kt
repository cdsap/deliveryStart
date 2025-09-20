package com.awesomeapp.commentcomment

sealed class State451_99 {
    data object Loading : State451_99()
    data class Success(val data: String) : State451_99()
    data class Error(val message: String) : State451_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}