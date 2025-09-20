package com.awesomeapp.photo

sealed class State45_84 {
    data object Loading : State45_84()
    data class Success(val data: String) : State45_84()
    data class Error(val message: String) : State45_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}