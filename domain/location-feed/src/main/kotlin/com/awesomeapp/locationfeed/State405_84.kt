package com.awesomeapp.locationfeed

sealed class State405_84 {
    data object Loading : State405_84()
    data class Success(val data: String) : State405_84()
    data class Error(val message: String) : State405_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}