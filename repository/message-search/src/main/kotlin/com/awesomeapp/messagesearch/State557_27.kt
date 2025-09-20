package com.awesomeapp.messagesearch

sealed class State557_27 {
    data object Loading : State557_27()
    data class Success(val data: String) : State557_27()
    data class Error(val message: String) : State557_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}