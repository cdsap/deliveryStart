package com.awesomeapp.medianetwork

sealed class State684_24 {
    data object Loading : State684_24()
    data class Success(val data: String) : State684_24()
    data class Error(val message: String) : State684_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}