package com.awesomeapp.checkoutlogin

sealed class State103_69 {
    data object Loading : State103_69()
    data class Success(val data: String) : State103_69()
    data class Error(val message: String) : State103_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}