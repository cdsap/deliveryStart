package com.awesomeapp.searchfeed

sealed class State404_14 {
    data object Loading : State404_14()
    data class Success(val data: String) : State404_14()
    data class Error(val message: String) : State404_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}