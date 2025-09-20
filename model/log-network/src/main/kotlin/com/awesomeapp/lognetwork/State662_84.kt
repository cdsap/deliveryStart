package com.awesomeapp.lognetwork

sealed class State662_84 {
    data object Loading : State662_84()
    data class Success(val data: String) : State662_84()
    data class Error(val message: String) : State662_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}