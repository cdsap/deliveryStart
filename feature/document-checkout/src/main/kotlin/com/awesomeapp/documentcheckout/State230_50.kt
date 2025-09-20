package com.awesomeapp.documentcheckout

sealed class State230_50 {
    data object Loading : State230_50()
    data class Success(val data: String) : State230_50()
    data class Error(val message: String) : State230_50()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}