package com.awesomeapp.todocart

sealed class State281_51 {
    data object Loading : State281_51()
    data class Success(val data: String) : State281_51()
    data class Error(val message: String) : State281_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}