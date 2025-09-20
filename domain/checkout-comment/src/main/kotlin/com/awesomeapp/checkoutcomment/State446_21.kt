package com.awesomeapp.checkoutcomment

sealed class State446_21 {
    data object Loading : State446_21()
    data class Success(val data: String) : State446_21()
    data class Error(val message: String) : State446_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}