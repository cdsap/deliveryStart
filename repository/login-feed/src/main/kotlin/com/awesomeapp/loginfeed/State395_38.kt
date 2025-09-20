package com.awesomeapp.loginfeed

sealed class State395_38 {
    data object Loading : State395_38()
    data class Success(val data: String) : State395_38()
    data class Error(val message: String) : State395_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}