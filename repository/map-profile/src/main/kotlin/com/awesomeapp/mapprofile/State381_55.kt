package com.awesomeapp.mapprofile

sealed class State381_55 {
    data object Loading : State381_55()
    data class Success(val data: String) : State381_55()
    data class Error(val message: String) : State381_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}