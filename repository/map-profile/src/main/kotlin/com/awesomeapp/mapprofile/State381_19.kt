package com.awesomeapp.mapprofile

sealed class State381_19 {
    data object Loading : State381_19()
    data class Success(val data: String) : State381_19()
    data class Error(val message: String) : State381_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}