package com.awesomeapp.mediasync

sealed class State733_72 {
    data object Loading : State733_72()
    data class Success(val data: String) : State733_72()
    data class Error(val message: String) : State733_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}