package com.awesomeapp.eventpost

sealed class State520_55 {
    data object Loading : State520_55()
    data class Success(val data: String) : State520_55()
    data class Error(val message: String) : State520_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}