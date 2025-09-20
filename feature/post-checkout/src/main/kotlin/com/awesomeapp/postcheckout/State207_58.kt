package com.awesomeapp.postcheckout

sealed class State207_58 {
    data object Loading : State207_58()
    data class Success(val data: String) : State207_58()
    data class Error(val message: String) : State207_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}