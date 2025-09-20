package com.awesomeapp.locationfeed

sealed class State405_57 {
    data object Loading : State405_57()
    data class Success(val data: String) : State405_57()
    data class Error(val message: String) : State405_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}