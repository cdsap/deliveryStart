package com.awesomeapp.newsprofile

sealed class State384_69 {
    data object Loading : State384_69()
    data class Success(val data: String) : State384_69()
    data class Error(val message: String) : State384_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}