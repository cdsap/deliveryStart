package com.awesomeapp.mediasync

sealed class State733_24 {
    data object Loading : State733_24()
    data class Success(val data: String) : State733_24()
    data class Error(val message: String) : State733_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}