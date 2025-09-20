package com.awesomeapp.useruser

sealed class State301_36 {
    data object Loading : State301_36()
    data class Success(val data: String) : State301_36()
    data class Error(val message: String) : State301_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}