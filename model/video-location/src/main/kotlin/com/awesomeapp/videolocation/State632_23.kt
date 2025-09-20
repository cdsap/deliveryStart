package com.awesomeapp.videolocation

sealed class State632_23 {
    data object Loading : State632_23()
    data class Success(val data: String) : State632_23()
    data class Error(val message: String) : State632_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}