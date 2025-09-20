package com.awesomeapp.synccontact

sealed class State64_50 {
    data object Loading : State64_50()
    data class Success(val data: String) : State64_50()
    data class Error(val message: String) : State64_50()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}