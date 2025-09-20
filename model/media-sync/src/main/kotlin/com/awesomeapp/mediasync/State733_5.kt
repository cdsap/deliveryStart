package com.awesomeapp.mediasync

sealed class State733_5 {
    data object Loading : State733_5()
    data class Success(val data: String) : State733_5()
    data class Error(val message: String) : State733_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}