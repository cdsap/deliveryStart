package com.awesomeapp.pushfeed

sealed class State393_28 {
    data object Loading : State393_28()
    data class Success(val data: String) : State393_28()
    data class Error(val message: String) : State393_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}