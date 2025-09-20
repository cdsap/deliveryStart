package com.awesomeapp.newscomment

sealed class State482_9 {
    data object Loading : State482_9()
    data class Success(val data: String) : State482_9()
    data class Error(val message: String) : State482_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}