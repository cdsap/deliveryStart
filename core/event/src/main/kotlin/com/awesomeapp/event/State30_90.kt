package com.awesomeapp.event

sealed class State30_90 {
    data object Loading : State30_90()
    data class Success(val data: String) : State30_90()
    data class Error(val message: String) : State30_90()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}