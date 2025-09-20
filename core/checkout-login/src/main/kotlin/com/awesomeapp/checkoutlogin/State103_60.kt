package com.awesomeapp.checkoutlogin

sealed class State103_60 {
    data object Loading : State103_60()
    data class Success(val data: String) : State103_60()
    data class Error(val message: String) : State103_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}