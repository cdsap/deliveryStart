package com.awesomeapp.eventpost

sealed class State520_31 {
    data object Loading : State520_31()
    data class Success(val data: String) : State520_31()
    data class Error(val message: String) : State520_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}