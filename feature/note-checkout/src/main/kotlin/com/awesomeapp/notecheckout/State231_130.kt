package com.awesomeapp.notecheckout

sealed class State231_130 {
    data object Loading : State231_130()
    data class Success(val data: String) : State231_130()
    data class Error(val message: String) : State231_130()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}