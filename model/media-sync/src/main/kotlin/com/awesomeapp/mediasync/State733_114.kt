package com.awesomeapp.mediasync

sealed class State733_114 {
    data object Loading : State733_114()
    data class Success(val data: String) : State733_114()
    data class Error(val message: String) : State733_114()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}