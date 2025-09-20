package com.awesomeapp.newsprofile

sealed class State384_72 {
    data object Loading : State384_72()
    data class Success(val data: String) : State384_72()
    data class Error(val message: String) : State384_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}