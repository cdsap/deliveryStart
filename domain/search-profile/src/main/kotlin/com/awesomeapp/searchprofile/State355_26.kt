package com.awesomeapp.searchprofile

sealed class State355_26 {
    data object Loading : State355_26()
    data class Success(val data: String) : State355_26()
    data class Error(val message: String) : State355_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}