package com.awesomeapp.eventlocation

sealed class State618_52 {
    data object Loading : State618_52()
    data class Success(val data: String) : State618_52()
    data class Error(val message: String) : State618_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}