package com.awesomeapp.identitypost

sealed class State494_21 {
    data object Loading : State494_21()
    data class Success(val data: String) : State494_21()
    data class Error(val message: String) : State494_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}