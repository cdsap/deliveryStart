package com.awesomeapp.audiocomment

sealed class State489_52 {
    data object Loading : State489_52()
    data class Success(val data: String) : State489_52()
    data class Error(val message: String) : State489_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}