package com.awesomeapp.messagesearch

sealed class State557_18 {
    data object Loading : State557_18()
    data class Success(val data: String) : State557_18()
    data class Error(val message: String) : State557_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}