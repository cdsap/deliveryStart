package com.awesomeapp.sessionnetwork

sealed class State659_84 {
    data object Loading : State659_84()
    data class Success(val data: String) : State659_84()
    data class Error(val message: String) : State659_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}