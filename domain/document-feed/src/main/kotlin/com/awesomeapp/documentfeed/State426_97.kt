package com.awesomeapp.documentfeed

sealed class State426_97 {
    data object Loading : State426_97()
    data class Success(val data: String) : State426_97()
    data class Error(val message: String) : State426_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}