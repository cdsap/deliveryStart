package com.awesomeapp.eventpost

sealed class State520_13 {
    data object Loading : State520_13()
    data class Success(val data: String) : State520_13()
    data class Error(val message: String) : State520_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}