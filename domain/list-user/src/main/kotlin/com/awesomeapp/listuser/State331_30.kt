package com.awesomeapp.listuser

sealed class State331_30 {
    data object Loading : State331_30()
    data class Success(val data: String) : State331_30()
    data class Error(val message: String) : State331_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}