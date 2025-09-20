package com.awesomeapp.photocart

sealed class State290_41 {
    data object Loading : State290_41()
    data class Success(val data: String) : State290_41()
    data class Error(val message: String) : State290_41()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}