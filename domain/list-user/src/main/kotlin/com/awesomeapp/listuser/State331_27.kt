package com.awesomeapp.listuser

sealed class State331_27 {
    data object Loading : State331_27()
    data class Success(val data: String) : State331_27()
    data class Error(val message: String) : State331_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}