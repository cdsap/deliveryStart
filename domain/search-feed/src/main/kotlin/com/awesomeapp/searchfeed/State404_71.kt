package com.awesomeapp.searchfeed

sealed class State404_71 {
    data object Loading : State404_71()
    data class Success(val data: String) : State404_71()
    data class Error(val message: String) : State404_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}