package com.awesomeapp.listuser

sealed class State331_15 {
    data object Loading : State331_15()
    data class Success(val data: String) : State331_15()
    data class Error(val message: String) : State331_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}