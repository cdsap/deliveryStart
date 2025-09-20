package com.awesomeapp.messagesearch

sealed class State557_51 {
    data object Loading : State557_51()
    data class Success(val data: String) : State557_51()
    data class Error(val message: String) : State557_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}