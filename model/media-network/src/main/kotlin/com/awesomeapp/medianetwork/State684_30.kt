package com.awesomeapp.medianetwork

sealed class State684_30 {
    data object Loading : State684_30()
    data class Success(val data: String) : State684_30()
    data class Error(val message: String) : State684_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}