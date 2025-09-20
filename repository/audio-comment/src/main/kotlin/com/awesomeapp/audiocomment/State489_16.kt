package com.awesomeapp.audiocomment

sealed class State489_16 {
    data object Loading : State489_16()
    data class Success(val data: String) : State489_16()
    data class Error(val message: String) : State489_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}