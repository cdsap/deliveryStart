package com.awesomeapp.notecheckout

sealed class State231_28 {
    data object Loading : State231_28()
    data class Success(val data: String) : State231_28()
    data class Error(val message: String) : State231_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}