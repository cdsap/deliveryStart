package com.awesomeapp.sessionnetwork

sealed class State659_72 {
    data object Loading : State659_72()
    data class Success(val data: String) : State659_72()
    data class Error(val message: String) : State659_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}