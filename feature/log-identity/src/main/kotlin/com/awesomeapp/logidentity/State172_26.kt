package com.awesomeapp.logidentity

sealed class State172_26 {
    data object Loading : State172_26()
    data class Success(val data: String) : State172_26()
    data class Error(val message: String) : State172_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}