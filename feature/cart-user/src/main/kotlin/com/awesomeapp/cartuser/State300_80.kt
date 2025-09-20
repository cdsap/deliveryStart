package com.awesomeapp.cartuser

sealed class State300_80 {
    data object Loading : State300_80()
    data class Success(val data: String) : State300_80()
    data class Error(val message: String) : State300_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}