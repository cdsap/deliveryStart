package com.awesomeapp.logidentity

sealed class State172_38 {
    data object Loading : State172_38()
    data class Success(val data: String) : State172_38()
    data class Error(val message: String) : State172_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}