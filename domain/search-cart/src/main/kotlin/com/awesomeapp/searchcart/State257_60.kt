package com.awesomeapp.searchcart

sealed class State257_60 {
    data object Loading : State257_60()
    data class Success(val data: String) : State257_60()
    data class Error(val message: String) : State257_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}