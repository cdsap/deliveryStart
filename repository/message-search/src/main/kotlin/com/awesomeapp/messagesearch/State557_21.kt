package com.awesomeapp.messagesearch

sealed class State557_21 {
    data object Loading : State557_21()
    data class Success(val data: String) : State557_21()
    data class Error(val message: String) : State557_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}