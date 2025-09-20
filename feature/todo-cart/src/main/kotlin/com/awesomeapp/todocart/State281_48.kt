package com.awesomeapp.todocart

sealed class State281_48 {
    data object Loading : State281_48()
    data class Success(val data: String) : State281_48()
    data class Error(val message: String) : State281_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}