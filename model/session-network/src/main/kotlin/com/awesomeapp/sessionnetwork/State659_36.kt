package com.awesomeapp.sessionnetwork

sealed class State659_36 {
    data object Loading : State659_36()
    data class Success(val data: String) : State659_36()
    data class Error(val message: String) : State659_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}