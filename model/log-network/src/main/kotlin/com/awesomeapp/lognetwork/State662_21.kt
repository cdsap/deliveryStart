package com.awesomeapp.lognetwork

sealed class State662_21 {
    data object Loading : State662_21()
    data class Success(val data: String) : State662_21()
    data class Error(val message: String) : State662_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}