package com.awesomeapp.feedcomment

sealed class State450_33 {
    data object Loading : State450_33()
    data class Success(val data: String) : State450_33()
    data class Error(val message: String) : State450_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}