package com.awesomeapp.userlocation

sealed class State595_35 {
    data object Loading : State595_35()
    data class Success(val data: String) : State595_35()
    data class Error(val message: String) : State595_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}