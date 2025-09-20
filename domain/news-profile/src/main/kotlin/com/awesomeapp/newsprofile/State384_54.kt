package com.awesomeapp.newsprofile

sealed class State384_54 {
    data object Loading : State384_54()
    data class Success(val data: String) : State384_54()
    data class Error(val message: String) : State384_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}