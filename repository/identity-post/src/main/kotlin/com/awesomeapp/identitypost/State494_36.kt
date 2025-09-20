package com.awesomeapp.identitypost

sealed class State494_36 {
    data object Loading : State494_36()
    data class Success(val data: String) : State494_36()
    data class Error(val message: String) : State494_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}