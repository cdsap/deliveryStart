package com.awesomeapp.searchfeed

sealed class State404_50 {
    data object Loading : State404_50()
    data class Success(val data: String) : State404_50()
    data class Error(val message: String) : State404_50()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}