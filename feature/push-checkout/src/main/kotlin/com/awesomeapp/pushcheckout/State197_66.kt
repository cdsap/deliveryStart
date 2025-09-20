package com.awesomeapp.pushcheckout

sealed class State197_66 {
    data object Loading : State197_66()
    data class Success(val data: String) : State197_66()
    data class Error(val message: String) : State197_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}