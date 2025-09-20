package com.awesomeapp.medianetwork

sealed class State684_33 {
    data object Loading : State684_33()
    data class Success(val data: String) : State684_33()
    data class Error(val message: String) : State684_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}