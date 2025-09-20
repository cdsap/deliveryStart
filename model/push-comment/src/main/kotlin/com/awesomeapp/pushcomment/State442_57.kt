package com.awesomeapp.pushcomment

sealed class State442_57 {
    data object Loading : State442_57()
    data class Success(val data: String) : State442_57()
    data class Error(val message: String) : State442_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}