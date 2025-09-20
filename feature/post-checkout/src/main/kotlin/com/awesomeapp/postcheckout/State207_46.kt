package com.awesomeapp.postcheckout

sealed class State207_46 {
    data object Loading : State207_46()
    data class Success(val data: String) : State207_46()
    data class Error(val message: String) : State207_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}