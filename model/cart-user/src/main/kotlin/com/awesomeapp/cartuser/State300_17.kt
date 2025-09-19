package com.awesomeapp.cartuser

sealed class State300_17 {
    data object Loading : State300_17()
    data class Success(val data: String) : State300_17()
    data class Error(val message: String) : State300_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}