package com.awesomeapp.eventpost

sealed class State520_16 {
    data object Loading : State520_16()
    data class Success(val data: String) : State520_16()
    data class Error(val message: String) : State520_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}