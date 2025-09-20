package com.awesomeapp.feedcomment

sealed class State450_18 {
    data object Loading : State450_18()
    data class Success(val data: String) : State450_18()
    data class Error(val message: String) : State450_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}