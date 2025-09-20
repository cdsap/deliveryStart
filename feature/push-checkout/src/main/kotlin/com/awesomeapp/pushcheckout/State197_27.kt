package com.awesomeapp.pushcheckout

sealed class State197_27 {
    data object Loading : State197_27()
    data class Success(val data: String) : State197_27()
    data class Error(val message: String) : State197_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}