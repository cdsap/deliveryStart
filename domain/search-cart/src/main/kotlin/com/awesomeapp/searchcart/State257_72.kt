package com.awesomeapp.searchcart

sealed class State257_72 {
    data object Loading : State257_72()
    data class Success(val data: String) : State257_72()
    data class Error(val message: String) : State257_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}