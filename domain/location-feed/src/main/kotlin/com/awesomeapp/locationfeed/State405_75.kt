package com.awesomeapp.locationfeed

sealed class State405_75 {
    data object Loading : State405_75()
    data class Success(val data: String) : State405_75()
    data class Error(val message: String) : State405_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}