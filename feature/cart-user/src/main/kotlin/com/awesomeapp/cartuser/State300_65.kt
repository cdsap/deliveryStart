package com.awesomeapp.cartuser

sealed class State300_65 {
    data object Loading : State300_65()
    data class Success(val data: String) : State300_65()
    data class Error(val message: String) : State300_65()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}