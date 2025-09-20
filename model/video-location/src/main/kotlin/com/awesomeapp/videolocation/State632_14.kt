package com.awesomeapp.videolocation

sealed class State632_14 {
    data object Loading : State632_14()
    data class Success(val data: String) : State632_14()
    data class Error(val message: String) : State632_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}