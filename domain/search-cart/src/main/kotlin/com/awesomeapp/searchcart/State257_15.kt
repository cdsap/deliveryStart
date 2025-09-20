package com.awesomeapp.searchcart

sealed class State257_15 {
    data object Loading : State257_15()
    data class Success(val data: String) : State257_15()
    data class Error(val message: String) : State257_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}