package com.awesomeapp.pushidentity

sealed class State148_74 {
    data object Loading : State148_74()
    data class Success(val data: String) : State148_74()
    data class Error(val message: String) : State148_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}