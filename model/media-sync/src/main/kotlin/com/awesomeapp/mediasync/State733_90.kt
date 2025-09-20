package com.awesomeapp.mediasync

sealed class State733_90 {
    data object Loading : State733_90()
    data class Success(val data: String) : State733_90()
    data class Error(val message: String) : State733_90()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}