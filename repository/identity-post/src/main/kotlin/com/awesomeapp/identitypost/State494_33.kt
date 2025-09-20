package com.awesomeapp.identitypost

sealed class State494_33 {
    data object Loading : State494_33()
    data class Success(val data: String) : State494_33()
    data class Error(val message: String) : State494_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}