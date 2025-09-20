package com.awesomeapp.messagenetwork

sealed class State655_47 {
    data object Loading : State655_47()
    data class Success(val data: String) : State655_47()
    data class Error(val message: String) : State655_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}