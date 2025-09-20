package com.awesomeapp.checkoutcomment

sealed class State446_42 {
    data object Loading : State446_42()
    data class Success(val data: String) : State446_42()
    data class Error(val message: String) : State446_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}