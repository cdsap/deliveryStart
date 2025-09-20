package com.awesomeapp.audiocomment

sealed class State489_37 {
    data object Loading : State489_37()
    data class Success(val data: String) : State489_37()
    data class Error(val message: String) : State489_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}