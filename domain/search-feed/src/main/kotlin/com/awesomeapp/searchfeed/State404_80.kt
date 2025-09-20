package com.awesomeapp.searchfeed

sealed class State404_80 {
    data object Loading : State404_80()
    data class Success(val data: String) : State404_80()
    data class Error(val message: String) : State404_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}