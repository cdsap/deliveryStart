package com.awesomeapp.documentfeed

sealed class State426_52 {
    data object Loading : State426_52()
    data class Success(val data: String) : State426_52()
    data class Error(val message: String) : State426_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}