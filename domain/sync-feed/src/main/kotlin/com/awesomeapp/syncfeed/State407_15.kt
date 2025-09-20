package com.awesomeapp.syncfeed

sealed class State407_15 {
    data object Loading : State407_15()
    data class Success(val data: String) : State407_15()
    data class Error(val message: String) : State407_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}