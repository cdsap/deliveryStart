package com.awesomeapp.eventcomment

sealed class State471_28 {
    data object Loading : State471_28()
    data class Success(val data: String) : State471_28()
    data class Error(val message: String) : State471_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}