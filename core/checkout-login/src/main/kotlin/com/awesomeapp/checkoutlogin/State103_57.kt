package com.awesomeapp.checkoutlogin

sealed class State103_57 {
    data object Loading : State103_57()
    data class Success(val data: String) : State103_57()
    data class Error(val message: String) : State103_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}