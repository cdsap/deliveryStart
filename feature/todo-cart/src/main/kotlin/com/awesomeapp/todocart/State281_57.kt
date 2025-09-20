package com.awesomeapp.todocart

sealed class State281_57 {
    data object Loading : State281_57()
    data class Success(val data: String) : State281_57()
    data class Error(val message: String) : State281_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}