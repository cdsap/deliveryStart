package com.awesomeapp.checkoutidentity

sealed class State152_71 {
    data object Loading : State152_71()
    data class Success(val data: String) : State152_71()
    data class Error(val message: String) : State152_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}