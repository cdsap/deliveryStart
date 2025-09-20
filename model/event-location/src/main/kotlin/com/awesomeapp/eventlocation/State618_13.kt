package com.awesomeapp.eventlocation

sealed class State618_13 {
    data object Loading : State618_13()
    data class Success(val data: String) : State618_13()
    data class Error(val message: String) : State618_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}