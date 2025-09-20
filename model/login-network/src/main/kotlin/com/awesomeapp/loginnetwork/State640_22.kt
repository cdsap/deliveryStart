package com.awesomeapp.loginnetwork

sealed class State640_22 {
    data object Loading : State640_22()
    data class Success(val data: String) : State640_22()
    data class Error(val message: String) : State640_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}