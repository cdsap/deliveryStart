package com.awesomeapp.audiocomment

sealed class State489_61 {
    data object Loading : State489_61()
    data class Success(val data: String) : State489_61()
    data class Error(val message: String) : State489_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}