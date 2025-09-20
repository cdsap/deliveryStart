package com.awesomeapp.checkoutfeed

sealed class State397_9 {
    data object Loading : State397_9()
    data class Success(val data: String) : State397_9()
    data class Error(val message: String) : State397_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}