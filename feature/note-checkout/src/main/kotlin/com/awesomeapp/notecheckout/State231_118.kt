package com.awesomeapp.notecheckout

sealed class State231_118 {
    data object Loading : State231_118()
    data class Success(val data: String) : State231_118()
    data class Error(val message: String) : State231_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}